package com.example.reptile4meituri.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 通用下载工具类
 */
public class DownloadUtil {

    private static final Logger logger = LoggerFactory.getLogger(DownloadUtil.class);

    /**
     * 图片下载
     *
     * @param onlinePath 线上图片路径
     * @param localPath  本地图片路径
     */
    public static void downloadPicture(String onlinePath, String localPath) {
        try (DataInputStream dataInputStream = new DataInputStream(new URL(onlinePath).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(new File(localPath))) {

            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());

            logger.info("==>downloadPicture() onlinePath={} 下载成功", onlinePath);
        } catch (Exception e) {
            logger.error(e.getMessage());
//            e.printStackTrace();
        }
    }


}
