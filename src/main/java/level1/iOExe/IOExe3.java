package com.study.iOExe;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
 * 在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
 * 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
 */
public class IOExe3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\b.txt",true);
        fileOutputStream.write("\r\n".getBytes());
        for(int i = 0; i < 5; i++) {
            fileOutputStream.write("I LOVE 白笑嫣\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
