package com.study.iOExe;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"
 */
public class IOExe2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\b.txt");
        byte[] bys = "I love 白笑嫣".getBytes();
        fos.write(bys);
        fos.close();
    }
}
