package com.study.iOExe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’
 */
public class IOExe1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\a.txt");
        fos.write(97);
        fos.close();
    }
}
