package com.study.iOExe;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符,
 * 使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
 */
public class IOExe4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("d:\\a.txt");
        int len = -1;
        while ((len = fileInputStream.read()) != -1) {
            System.err.print((char)len);
        }
    }
}
