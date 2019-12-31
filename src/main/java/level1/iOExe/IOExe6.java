package com.study.iOExe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
 * 要求：
 * 一次读写一个字节的方式
 */
public class IOExe6 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("d:\\IMG_1835.JPG");
        //创建字节输出流对象
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\aaa\\IMG_1835.JPG");
        //一次读取一个字节数组
        byte[] bytes = new byte[1024];
        //定义读取的字节长度
        int len = -1;
        //如果读取的字节长度为-1，则说明文件已到末尾，否则还有数据，可以继续读取
        while ((len = fileInputStream.read(bytes)) != -1) {
            //调用FileOutputStream的write()方法，传入三个参数
            fileOutputStream.write(bytes,0,len);
        }
        //关闭输入流，不再读取数据
        fileInputStream.close();
        //关闭输出流，不再读取数据，释放资源
        fileOutputStream.close();
    }
}
