package com.study.fileExe;

import java.io.File;
import java.io.IOException;

/**
 * 获取D盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台。
 * 答案:
 * 操作步骤:
 * 1.    在D盘aaa文件夹中创建一个b.txt文件并输入数据
 * 2.    创建文件对象关联路径：d:/aaa/b.txt
 * 3.    调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法
 */
public class FileExe6 {
    public static void main(String[] args) {
        File file = new File("d:\\aaa");
        file.mkdirs();
        File file2 = new File(file,"\\b.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = file2.getName();
        long fileSize = file2.length();
        String absolutePath = file2.getAbsolutePath();
        File parentFile = file2.getParentFile();
        System.err.println(fileName);
        System.err.println(fileSize);
        System.err.println(absolutePath);
        System.err.println(parentFile);
    }


}
