package com.example.reptile4meituri.util;

/**
 * 子线程下载
 *
 * @since 2019-09-16
 */
public class DownImageThread implements Runnable {

    private String onlinePath;
    private String localPath;

    public DownImageThread(String onlinePath, String localPath) {
        this.onlinePath = onlinePath;
        this.localPath = localPath;
    }

    @Override
    public void run() {
        DownloadUtil.downloadPicture(onlinePath, localPath);
    }
}
