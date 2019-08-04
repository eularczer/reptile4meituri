package com.example.reptile4meituri.controller;

import com.example.reptile4meituri.dao.AlbumJpaDAO;
import com.example.reptile4meituri.entity.AlbumDO;
import com.example.reptile4meituri.enums.InstitutionTypeEnum;
import com.example.reptile4meituri.util.DownloadUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 美图日-爬虫 HTTP 调用接口
 *
 * @author zhangyiyang
 * @since 2019-06-15
 */
@RestController
@RequestMapping("/v1")
public class DefaultController {

    private static final Logger logger = LoggerFactory.getLogger(DefaultController.class);

    @Autowired
    private AlbumJpaDAO albumJpaDAO;

    /**
     * 美图日-相册详情页面路径前缀
     */
    private static final String MEITURI_URL_PREFIX = "https://www.meituri.com/a/";
    /**
     * 美图日-图片真实路径前缀
     */
    private static final String MEITURI_IMG_URL_PREFIX = "https://ii.hywly.com/a/1/";
    /**
     * 美图日-本地存储路径前缀
     */
    private static final String MEITURI_LOCAL_PREFIX = "D:/美图日爬虫/";

    /**
     * Step1: 获取网站图册的具体数量。
     * <p>
     * 图册的实际数量究竟有多少呢？由于图册编号是全局唯一的，因此可以通过请求一遍封面图来获取整个网站的图册数。
     * <p>
     * 结果：6~27864（共 27859 个）
     * <p>
     * 2019-06-21 27865~28467（新增 603 个）
     */
    @PostMapping("/step1")
    public String step1() {
        final String LOCAL_FOLDER = MEITURI_LOCAL_PREFIX + "封面图/";
        for (int i = 28468; i <= 35000; i++) {
            String onlinePath = MEITURI_IMG_URL_PREFIX + i + "/0.jpg";
            String localPath = i + "-0.jpg";
            String filePath = LOCAL_FOLDER + localPath;
            DownloadUtil.downloadPicture(onlinePath, filePath);
        }
        return "success";
    }

    /**
     * Step2: 获取真正能访问的图册，并使用（Jsoup）获取各相册的图片数量，持久化到数据库（MySQL）中。
     * <p>
     * Step1 中获得的 27859 个相册并不都能正常访问。且由于下载业务需要知道各相册的图片数量以便进行遍历访问
     * （通过暴力请求需要处理异常，效率低下，且容易由于网络波动而导致循环断掉）。
     * <p>
     * 结果：{555, 2567, 2568, 2578, 2684, 4359, 4375, 4398, 5237, 5254,
     * 5259, 7244, 7457, 7489, 8188, 8279, 8350, 8375, 12101, 12118,
     * 12160, 12930, 13074, 14944, 15613, 16559, 16683, 17728, 19385, 21688,
     * 22449, 22565, 23376, 23427, 23983, 24063, 24083, 24197, 24290, 27271,
     * 27272, 27273}; 共 42 个相册不能正常访问。
     */
    @PostMapping("/step2")
    public String step2() {
        // 当前相册最小编号
        final int ALBUM_MIN = 28468;
        // 当前相册最大编号
        final int ALBUM_MAX = 28879;
        // 用于提取单个相册图片总数的正则
        final Pattern p = Pattern.compile("\\d+P");

        for (int i = ALBUM_MIN; i <= ALBUM_MAX; i++) {
            if (albumJpaDAO.findByNumberEquals(i) != null) {
                logger.warn("==>step2() i={} 记录已存在，不再重复记录", i);
                continue;
            }
            Document document;
            try {
                document = Jsoup.connect(MEITURI_URL_PREFIX + i).get();
            } catch (IOException e) {
                // 打印 ERROR 级别 log 以便人工介入确认不能访问的真正原因。
                logger.error("==>step2() i={} 需人工介入确认不能访问的真正原因", i);
                // 请求失败直接进入下个循环
                continue;
            }
            String title = document.title();
            Elements elements = document.getElementsByTag("p");
            String elementsStr = elements.text();

            // 分析获取单个相册的图片总数
            Matcher matcher = p.matcher(elementsStr);
            int total = 0;
            if (matcher.find()) {
                total = Integer.parseInt(matcher.group(0).replace("P", ""));
            }

            // 持久化到数据库，注意此处并没有根据 InstitutionTypeEnum 枚举进行 institutionType 的赋值，
            // 这一步将涉及数据清洗，较为繁琐，代码未给出
            AlbumDO albumDO = new AlbumDO();
            albumDO.setNumber(i);
            albumDO.setTotal(total);
            albumDO.setTitle(title);
            albumJpaDAO.save(albumDO);

            // 打印 log，可省略
            logger.info("==>step2() albumDO.getNumber={} albumDO.getTotal={} albumDO.getTitle={}", albumDO.getNumber(), albumDO.getTotal(), albumDO.getTitle());
        }

        return "success";
    }

    /**
     * Step3: 下载单个相册图片（多线程）
     * <p>
     * 通过对应的 GET 请求参数下载对应的图册。达到手动调节线程数的效果。为了避免重复请求导致重复下载，该接口做了幂等处理。
     * <p>
     * Step2 统计得出能正常访问的相册共 27817 个，图片总数为 1602076 张。
     * <p>
     * 2019-06-21 30042
     */
    @GetMapping("/step3/{number}")
    public String step3(@PathVariable("number") Integer number) {
        List<AlbumDO> albumDOList = albumJpaDAO.findByInstitutionTypeEquals(number);
        this.doBatchDownload(albumDOList);

        return "success";
    }

    /**
     * Step4: 下载所有图片
     */
    @PostMapping("/step4")
    public String step4() {
        List<AlbumDO> albumDOList = albumJpaDAO.findAll();
        this.doBatchDownload(albumDOList);

        return "success";
    }

    private void doBatchDownload(List<AlbumDO> albumDOList) {
        for (AlbumDO albumDO : albumDOList) {

            int total = albumDO.getTotal();
            int num = albumDO.getNumber();
            String title = albumDO.getTitle();
            String fileFolder = InstitutionTypeEnum.getEnumBySeq(albumDO.getInstitutionType()).getDesc();

            String localFolder = MEITURI_LOCAL_PREFIX + fileFolder + "/" + num + "-" + title;
            // 若文件夹路径不存在，则新建
            File file = new File(localFolder);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    logger.error("==>number={} title={} 创建文件路径失败", num, title);
                }
            }

            for (int i = 0; i <= total; i++) {
                String onlinePath = MEITURI_IMG_URL_PREFIX + num + "/" + i + ".jpg";
                String localPath = localFolder + "/" + i + ".jpg";

                // 幂等，若当前文件未下载，则进行下载
                File file2 = new File(localPath);
                if (!file2.exists()) {
                    DownloadUtil.downloadPicture(onlinePath, localPath);
                }
            }
        }
    }
}
