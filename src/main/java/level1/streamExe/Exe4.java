package com.study.streamExe;

import java.util.stream.Stream;

/**
 * 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，
 * 使用Stream将以郭字开头的元素存入新数组
 */
public class Exe4 {
    public static void main(String[] args) {
        String[] arr1 = {"黄药师","冯蘅","郭靖","黄蓉","郭芙","郭襄","郭破虏"};
        Stream<String> stream = Stream.of(arr1);
        //String[]::new创建String的数组将Object[]数组转化为String[]数组
        String[] array = stream.filter(s -> s.startsWith("郭")).toArray(String[]::new);
        for (String s : array) {
            System.err.println(s);
        }
    }
}
