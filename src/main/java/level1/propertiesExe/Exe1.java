package com.study.propertiesExe;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * 我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
 * score.txt文件内容如下：
 * zhangsan = 90
 * lisi = 80
 * wangwu = 85
 */
public class Exe1 {
    public static void main(String[] args) throws IOException {
        //从文件中读取数据到Properties集合
        Properties properties = new Properties();
//        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("D:\\demo2\\src\\main\\java\\com\\study\\1.txt"));
        //由于load()方法接收Reader和InputStream，所以想用字节流就要用InputStream的子类，这里用FileInputStream
        FileInputStream fileInputStream = new FileInputStream("D:\\demo2\\src\\main\\java\\com\\study\\1.txt");
        //从文件中读取数据到Properties集合
        properties.load(fileInputStream);
        //关闭输入流
        fileInputStream.close();

        //用Set<String>接收所有键的集合
        serchName(properties);
//        serchName2(properties);
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\demo2\\src\\main\\java\\com\\study\\1.txt");
        //调用store()方法将数据存入文件
        properties.store(fos,"李四将分数修改为100分");
        //关闭输出流
        fos.close();
    }

    private static void serchName2(Properties properties) {
        String lisi = properties.getProperty("lisi");
        if(lisi != null) {
            properties.setProperty("lisi",String.valueOf(100));
        }
    }

    private static void serchName(Properties properties) {
        Set<String> namesSet = properties.stringPropertyNames();
        //遍历键
        for (String string : namesSet) {
            if(string.equals("lisi")) {
                properties.setProperty(string,String.valueOf(100));
            }
        }
    }
}
