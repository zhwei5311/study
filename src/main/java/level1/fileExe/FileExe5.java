package com.study.fileExe;

import java.io.File;

/**
 * 将D盘下a.txt文件删除
 * 将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
 */
public class FileExe5 {
    public static void main(String[] args) {
        File file = new File("c:\\a.txt");
        file.delete();
        File file1 = new File("c:\\aaa");
        file1.delete();
    }
}
