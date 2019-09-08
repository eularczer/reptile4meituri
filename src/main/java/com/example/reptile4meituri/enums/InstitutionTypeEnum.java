package com.example.reptile4meituri.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 美图日-机构编号枚举
 * https://www.meituri.com/jigou/
 * eg.https://www.meituri.com/x/85/
 *
 * @author zhangyiyang
 * @since 2019-06-15
 */
public enum InstitutionTypeEnum {

    /**
     * 阳光宝贝SUNGIRL
     */
    SUN_GIRL(88,"阳光宝贝SUNGIRL"),

    /**
     * 丝意SIEE
     */
    SI_YI(87,"丝意SIEE"),

//    /**
//     * 萝莉COS
//     */
//    LUO_LI_COS(87, "萝莉COS"),

    /**
     * 风之领域
     */
    FENG_ZHI_LING_YU(86, "风之领域"),

    /**
     * 语画界。秀人平台下的一个写真机构。写真风格与其他机构类似。
     */
    HUA_YU_JIE(85, "语画界"),

    /**
     * 尤美。新兴的一家美女写真机构。
     */
    YOU_MEI(84, "尤美"),

    /**
     * CosPlay。日本CosPlay是整个CosPlay行业比较发达的产业。
     */
    COSPLAY(83, "CosPlay"),

    /**
     * 森萝财团。专门拍摄萝莉丝袜美腿丝足类的写真机构
     */
    SEN_LUO_CAI_TUAN(82, "森萝财团"),

    /**
     * 蜜丝。国内丝袜诱惑类美女写真集。与AISS爱丝、Legbaby美腿宝贝、都是同类的写真机构。
     */
    MI_SI(81, "蜜丝"),

    /**
     * Cosdoki。日本美少女类写真机构。
     */
    COSDOKI(80, "Cosdoki"),

    /**
     * Girlz-High。日本美少女写真摄影机构。
     */
    GIRLZ_HIGH(79, "Girlz-High"),

    /**
     * 台湾正妹。收录的写真集都是流传在网络上的台湾女神的写真套图。包括各种台湾正妹、台湾网红美女写真图片等。
     */
    TAI_WAN_ZHENG_MEI(78, "台湾正妹"),

    /**
     * 猎女神。国内一家美女写真摄影网站机构。
     */
    LIE_NV_SHEN(77, "猎女神"),

    /**
     * OnlyTease。号称是欧美丝袜写真的泰斗。欧美从业最早也是最专业的丝袜美女写真机构。每套图片的张数都是业内良心，几乎都是100+。
     * 因部分图片尺度比较大不宜流传，所以过滤掉了。
     */
    ONLY_TEASE(76, "OnlyTease"),

    /**
     * 推女郎。国内最著名的写真机构，拍摄唯美大胆的美女写真集，尤其是无圣光类的，受到了广大网友的喜爱！
     */
    TUI_NV_LANG(75, "推女郎"),

    /**
     * 美媛馆。原是独立的写真机构，后并到秀人网平台下。
     */
    MEI_YUAN_GUAN(74, "美媛馆"),

    /**
     * 尤物馆。秀人网平台下的写真机构
     */
    YOU_WU_GUAN(73, "尤物馆"),

    /**
     * 魅妍社。秀人网平台下的写真机构
     */
    MEI_YAN_SHE(72, "魅妍社"),

    /**
     * 蜜桃社。秀人网平台下的写真机构
     */
    MI_TAO_SHE(71, "蜜桃社"),

    /**
     * 模范学院。秀人网平台下的写真机构
     */
    MO_FAN_XUE_YUAN(70, "模范学院"),

    /**
     * 星乐园。秀人网平台旗下的写真机构
     */
    XING_LE_YUAN(69, "星乐园"),

    /**
     * 爱蜜社。秀人网平台下的写真机构
     */
    AI_MI_SHE(68, "爱蜜社"),

    /**
     * 嗲囡囡。秀人网平台旗下的写真机构。
     */
    DIA_NAN_NAN(67, "嗲囡囡"),

    /**
     * 波萝社。原属于秀人网旗下的写真机构（原波萝社已经由兔几盟更新了）；现已独立出来自己开了一个摄影平台。主要拍摄清新、唯美、萝莉类的写真集。
     * 本站收录的前期的写真集都是秀人网平台下的，最新更新的都是新波萝社的。
     */
    BO_LUO_SHE(66, "波萝社"),

    /**
     * misty。精心搜集的日本@misty写真集图片，基本上网络上流传的写真集图片都在这里了
     */
    MISTY(65, "misty"),

    /**
     * Wanibooks。简称：WBGC。日本老牌写真机构，更新的图片多是清新、唯美风格。图片尺寸较小。
     */
    WANIBOOKS(64, "Wanibooks"),

    /**
     * 尤果网。国内最著名的美女写真发行网站之一，旗下的尤果圈爱尤物 APP做的也是相当不错，。精心整理的全网最完整的尤果网Ugirls写真全集
     */
    YOU_GUO_WANG(63, "尤果网"),

    /**
     * 尤果圈爱尤物。现在全名是：尤果圈爱尤物，原来的名字：Ugirls爱尤物。是尤果网的APP版。几乎是每是更新一套。
     */
    YOU_GUO_QUAN_AI_YOU_WU(62, "尤果圈爱尤物"),

    /**
     * 影私荟。秀人网旗下的写真机构，不过目前好象是停止更新了。一共出了22期写真集
     */
    YING_SI_HUI(61, "影私荟"),

    /**
     * 顽味生活。隶属于秀人网旗下的写真机构。
     */
    WAN_WEI_SHENG_HUO(60, "顽味生活"),

    /**
     * 秀人网。国内目前最著名的写真机构平台。旗下下的写真机构较多，
     * 包括：美媛馆、尤物馆、魅妍社、蜜桃社、模范学院、星乐园、爱蜜社、嗲囡囡、影私荟、优星馆、顽味生活、御女郎、等。
     * 除了有很多写真机构入驻发布写真集外，XIUREN秀人网官方也经常发布写真集，目前收录的就是这部分。
     */
    XIU_REN_WANG(59, "秀人网"),

    /**
     * 尤蜜荟。目前是秀人网旗下的一家写真机构；之前曾在推女神发布写真集，现在转到秀人网平台发展。
     * 美图日收录的YOUMI尤蜜荟写真集即包括推女神YOUMI尤蜜荟，当然以后主要更新的也都是秀人网YOUMI尤蜜荟的写真集
     */
    YOU_MI_HUI(58, "尤蜜荟"),

    /**
     * Beautyleg。台湾著名美腿写真发行机构。美图日整理的是Beautyleg官网超高清美腿写真集。从NO.200开始更新，之前的质量比较差，所以略过。
     */
    BEAUTYLEG(57, "Beautyleg"),

    /**
     * 优星馆。秀人网平台下的写真机构品牌；已累计发行了38套写真集，不过目前UXING优星馆官网已经停止更新了。
     */
    YOU_XING_GUAN(56, "优星馆"),

    /**
     * 御女郎。目前是秀人网旗下的一家写真机构；之前曾在推女神发布写真集，现在转到秀人网平台发展。
     * 美图日收录的DKGirl御女郎写真集即包括推女神DK御女郎，当然以后主要更新的也都是秀人网DK御女郎的写真集
     */
    YU_NV_LANG(55, "御女郎"),

    /**
     * NS Eyes。精心搜集整理的日本NS Eyes全套高清写真合集
     */
    NS_EYES(54, "NS-Eyes"),

    /**
     * Image.tv。官方是没有编号的，都是按日期发行的。我们是从2006年1月开始整理更新。
     */
    IMAGE_TV(53, "ImageTv"),

    /**
     * YS Web。日本知名美女摄影写真机构。图片风格唯美，难得的写真好站。
     */
    YS_WEB(52, "YS-Web"),

    /**
     * Hello! Project Digital Books。简称：H!P Digital Books。写真界的一股清流，所拍摄的美女写真集全部都是清新、唯美类的。
     * 而且出镜的多是日本当红美少女、写真偶像等。
     */
    HELLO_PROJECT_DIGITAL_BOOKS(51, "HelloProjectDigitalBooks"),

    /**
     * Bomb.TV。日本著名的美女写真摄影机构。精心整理的日本Bomb.TV官网发行的写真集大全，全部都是超高清的原尺寸大图。
     */
    BOMB_TV(50, "BombTv"),

    /**
     * 丽柜。北京的一家娱乐摄影公司。主要拍摄丝足类美腿玉足写真集。
     * 早期的时候拍摄过捆绑绳艺类的类型，叫做：丽柜美束，我们用标签的形式划分开来方便用户浏览欣赏。
     */
    LI_GUI(49, "丽柜"),

    /**
     * PB写真集。全称：Photo Book。是一种实体写真书类的写真集，是日本、港台比较流行。
     */
    PB_XIE_ZHEN_JI(48, "PB写真集"),

    /**
     * 4K-STAR。日本著名美女写真摄影机构。拍摄风格与：RQ-STAR 相似。
     */
    _4K_STAR(47, "4K-STAR"),

    /**
     * ISHOW爱秀。国内一家美女写真摄影机构。约100期之前的都是免费的，后面也开始走收费路线了。
     */
    ISHOW_AI_XIU(46, "ISHOW爱秀"),

    /**
     * 头条女神。国内一家拍摄性感美女写真的摄影机构。所拍摄的图片尺度较大。精心整理的头条女神官网全套的写真套图。
     */
    TOU_TIAO_NV_SHEN(45, "头条女神"),

    /**
     * 动感之星。台湾美女摄影写真机构。旗下的模特称为：动感之星 ShowTimeDancer。多是跳一些美女热舞类的。
     * 美图日搜集整理了动感小站官网的动感之星全集的套图。
     */
    DONG_GAN_ZHI_XING(44, "动感之星"),

    /**
     * Graphis。日本一家非常著名的美女摄影写真机构。
     * 写真类型包括：Graphis gals、初脱ぎ娘、Feti-Style、Limited Edition、Special、每日一枚等。
     * 拍摄的写真集风格几乎都是清新、唯美、养眼类的，虽然漏点，但仍然还是非常的唯美养眼、堪称人体艺术级的美图。美图日已经过滤掉了漏点图片。
     */
    GRAPHIS(43, "Graphis"),

    /**
     * Bejean On Line。日本美女摄影写真机构。
     * 分为：私立Bejean女学館、Cover Girl、初写美人、Special 等多个分类，其中初写美人里面有较多图片不合适传播，所以过滤掉了。
     */
    BEJEAN_ON_LINE(42, "BejeanOnLine"),

    /**
     * 51MODO。是一家模特与艺术的展示平台，附有美女写真杂志。
     */
    _51MODO(41, "51MODO"),

    /**
     * Imuto.tv。收集要整理的日本Imuto.tv的写真套图，网络上流传的Imuto.tv图片不多，所以收录的也不太完整。
     */
    IMUTO_TV(40, "ImutoTv"),

    /**
     * 推女神。全称：TGOD推女神；是一家美女写真发行平台；图片质量比较高，不过目前官网已经更换域名并且更名为：青豆客；
     */
    TUI_NV_SHEN(39, "推女神"),

    /**
     * DDY Pantyhose。精心收录整理的DDY Pantyhose高叉舍宾亮丝全套的写真图片，都是超高清的写真集。
     */
    DDY_PANTYHOSE(38, "DDY-Pantyhose"),

    /**
     * 爱丝。国内知名丝袜美女摄影机构，自2016年已经停止更新了。AISS爱丝拍摄的图片，多是丝袜人体类的。风格比较清新、大胆。尺度也是比较大。
     */
    AI_SI(37, "爱丝"),

    /**
     * VYJ。日本主题类的美女写真摄影机构。主要拍摄对象为15-18岁的的现役初高中的在校学生，拍摄内容以制服，泳装为主。
     */
    VYJ(36, "VYJ"),

    /**
     * Minisuka.tv。日本主题类的美女写真摄影机构。主要拍摄对象为15-18岁的的现役初高中的在校学生，拍摄内容以制服，泳装为主。
     */
    MINISUKA_TV(35, "MinisukaTv"),

    /**
     * 网红馆。旧名：糖果画报，秀人网平台下的写真机构之一。
     */
    WANG_HONG_GUAN(34, "网红馆"),

    /**
     * WPB写真。简称：WPB。是日本一家美女写真摄影机构，拍摄的图片也多是杂志类的明星模特写真图片。
     */
    WPB_XIE_ZHEN(33, "WPB写真"),

    /**
     * 美腿宝贝。类似于AISS爱丝的一家丝袜美腿美女写真摄影机构，拍摄的图片尺度比较大，多是丝袜人体类的。出镜的模特也多是网络红人嫩模。
     */
    MEI_TUI_BAO_BEI(32, "美腿宝贝"),

    /**
     * 克拉女神。国内美女人像写真摄影平台网站之一。
     */
    KE_LA_NV_SHEN(31, "克拉女神"),

    /**
     * 瑞丝馆。原名: 猫萌榜MICAT，秀人网平台下的写真机构之一。
     */
    RUI_SI_GUAN(30, "瑞丝馆"),

    /**
     * 薄荷叶。秀人网平台下的写真机构之一。
     */
    BO_HE_YE(29, "薄荷叶"),

    /**
     * Sabra。日本一家美女摄影机构，多数是搜集自其他写真机构的图片重新加以组合的，虽然与其他机构的图片有所重复，但整体比较唯美、清新
     */
    SABRA(28, "Sabra"),

    /**
     * 果团网。国内美女人像写真摄影平台网站之一。
     */
    GUO_TUAN_WANG(27, "果团网"),

    /**
     * 青豆客。国内美女人像写真摄影平台网站之一，前身是推女神的改名并更换网站的写真网站。
     */
    QING_DOU_KE(26, "青豆客"),

    /**
     * 花の颜。秀人网平台下的写真机构之一。
     */
    HUA_YAN(25, "花颜"),

    /**
     * 模特联盟。秀人网平台下的写真机构之一。
     */
    MO_TE_LIAN_MENG(24, "模特联盟"),

    /**
     * 花漾。秀人网平台下的写真机构之一。
     */
    HUA_YANG(23, "花漾"),

    /**
     * 兔几盟。日本X-City旗下的写真分支。
     */
    TU_JI_MENG(22, "兔几盟"),

    /**
     * Juicy Honey。日本X-City旗下的写真分支。
     */
    JUICY_HONEY(21, "Juicy-Honey"),

    /**
     * X-City。日本老牌摄影写真机构。已创建十几年了。
     * X-City系列比较多，包括：WEB、Juicy Honey(独立成一个网站了)、Ane One Style、Kuki 绮丽、KIMONO 和服、JUKUJO 熟女等。
     */
    X_CITY(20, "X-City"),

    /**
     * Princess Collection。日本的一家美女写真集，自身并没有拍摄图片，主要是收集各类的图片经常加工而整理在一起。
     * 通常每组是10张图片，因为图片太少了，所以我们把同一个人的都整理成一个合辑了，方便用户欣赏！
     */
    PRINCESS_COLLECTION(19, "Princess-Collection"),

    /**
     * LovePop。日本美少女写真摄影机构。
     */
    LOVEPOP(18, "LovePop"),

    /**
     * Digi-Gra。日本一家美少女写真摄影机构。模特多是刚入行的日本女优。
     */
    DIGI_GRA(17, "Digi-Gra"),

    /**
     * 熊川纪信。果团网平台旗下的写真机分类构。
     */
    XIONG_CHUAN_JI_XIN(16, "熊川纪信"),

    /**
     * 星颜社。秀人网平台旗下的写真机构。
     */
    XING_YAN_SHE(15, "星颜社"),

//    /**
//     * 丝享家。隶属于IESS异思趣向旗下的一个写真类型。与丝足便当类似。
//     */
//    XI_XIANG_JIA(14, "丝享家"),
//
//    /**
//     * 丝足便当。隶属于IESS异思趣向旗下的一个写真类型。与丝享家类似。
//     */
//    XI_ZU_BIAN_DANG(13, "丝足便当"),

    /**
     * 异思趣向。全称：IESS异思趣向。国内专业的丝足写真机构。图片数量比较多，质量较高！另又分类两个分类，分别是：丝足便当 丝享家
     */
    YI_SI_QU_XIANG(12, "异思趣向"),

    /**
     * The Black Alley。别名：TBA、黑巷、TheBlackAlley。泰国知名人体写真机构。
     * 拍摄的图片质量都是非常高的，部分图片尺度太大，过滤掉了这部分图片，请理解！
     */
    THE_BLACK_ALLEY(11, "The-Black-Alley"),

    /**
     * 激萌文化。波萝社平台下的一个写真机构。拍摄风格主要是萝莉、清新、唯美类的写真集。
     */
    JI_MENG_WEN_HUA(10, "激萌文化"),

    /**
     * Young Animal Arashi。岚特刊，日本写真杂志机构。
     */
    YOUNG_ANIMAL_ARASHI(9, "Young-Animal-Arashi"),

    /**
     * DGC。按编号从NO.001到最新的日本DGC写真集，精心整理中
     */
    DGC(8, "DGC"),

    /**
     * RQ-STAR。日本专业的写真摄影机构；创办于2008年。从开始到现在，图片画质都是非常高。
     * 主要分为：Race Queen(赛车女郎)，Swim Suits(泳装)，Office Lady(办公室美女)，Private Dress(私人)，
     * Student Style(校服系列)，Nurse Costume(护士装系列)，Maid Costume(女仆系列)等。
     */
    RQ_STAR(7, "RQ-STAR"),

//    /**
//     * Young Animal。岚特刊，日本写真杂志机构。
//     */
//    YOUNG_ANIMAL(6, "Young-Animal"),

    /**
     * For-side。日本美女摄影写真机构，目前已经停止更新了，虽然尺寸不算大，但清晰度还是可以的。
     */
    FOR_SIDE(5, "For-side"),

    /**
     * Weekly Playboy。日本花花公子周刊。美图日整理的都是超高清的官网原图。
     */
    WEEKLY_PLAYBOY(4, "Weekly-Playboy"),

    /**
     * Weekly Young Jump。日本集英社发的周刊杂志。美女写真部分多是日本明星、偶像艺人、新人模特等。拍摄风格多是清新、唯美！
     */
    WEEKLY_YOUNG_JUMP(3, "Weekly-Young-Jump"),

    /**
     * 网络美女。精心整理搜集的网络美女图片、照片，都是流传的各类散图，没有专门的机构发行，多是超高清的写真集套图。
     */
    WANG_LUO_MEI_NV(2, "网络美女"),

    /**
     * BWH。日本的一家美女写真摄影机构，写真图片分为多个类型。包括：BJK系列,YMD系列,ANQ系列,NBB系列。
     * 现在网络上找不到最新的图片，收集的都是网络上流传的较老的写真集
     */
    BWH(1, "BWH"),

    /**
     * 未能找到对应机构
     */
    NDF(0, "NDF"),

    ;

    /**
     * 序号
     * eg. 85
     */
    private int seq;
    /**
     * 文件夹名
     */
    private String desc;

    InstitutionTypeEnum(int seq, String desc) {
        this.seq = seq;
        this.desc = desc;
    }

    public int getSeq() {
        return seq;
    }

    public String getDesc() {
        return desc;
    }

    public static Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>(values().length);
        for (InstitutionTypeEnum e : values()) {
            map.put(e.getSeq(), e.getDesc());
        }
        return map;
    }

    public static InstitutionTypeEnum getEnumByDesc(String desc) {
        for (InstitutionTypeEnum e : values()) {
            if (Objects.equals(e.getDesc(), desc)) {
                return e;
            }
        }
        return null;
    }

    public static InstitutionTypeEnum getEnumBySeq(int seq) {
        for (InstitutionTypeEnum e : values()) {
            if (Objects.equals(e.getSeq(), seq)) {
                return e;
            }
        }
        return null;
    }

}
