package com.study.streamExe;

import java.util.ArrayList;

/**
 * 已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，
 * 使用Stream
 * 1、取出前2个元素并在控制台打印输出。
 * 2、取出后2个元素并在控制台打印输出。
 */
public class Exe5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("陈玄风");
        arrayList.add("梅超风");
        arrayList.add("陆乘风");
        arrayList.add("曲灵风");
        arrayList.add("武眠风");
        arrayList.add("冯默风");
        arrayList.add("罗玉风");
        arrayList.stream().limit(2).forEach(System.err::println);
        arrayList.stream().skip(arrayList.size() - 2).forEach(System.err::println);
    }
}
