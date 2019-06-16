package com.example.reptile4meituri.util;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 通用下载工具类
 */
public class DownloadUtil {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 本地 txt 转 String
     *
     * @param fileName txt 文本路径
     * @return txt 文件 String
     */
    public static String readFileToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        int fileLen = (int) file.length();
        byte[] fileContent = new byte[fileLen];
        try (FileInputStream in = new FileInputStream(file)) {
            in.read(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(fileContent, encoding);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 正则成 String[]
     *
     * @param patternStr 正则表达式
     * @param inputStr   输入内容
     * @return String[]
     */
    public static String[] convertToStrArr(String patternStr, String inputStr) {
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(inputStr);
        ArrayList<String> tmpList = new ArrayList<>();
        while (matcher.find()) {
            tmpList.add(matcher.group());
        }
        String[] res = new String[tmpList.size()];
        int i = 0;
        for (String tmp : tmpList) {
            res[i] = tmp;
            i++;
        }
        return res;
    }
}
