package com.study.fileExe;

import java.io.File;

/**
 * 在D盘下创建一个名为bbb的文件夹。
 */
public class FileExe3 {
    public static void main(String[] args) {
        File file = new File("c:\\bbb");
        file.mkdir();
    }
}
