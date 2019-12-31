package com.study.exercise;

import java.util.Random;

/**
 * 创建一个长度为6的整数数组。请编写代码，随机生成六个0-100之间的整数存放到数组中，然后再计算出数组中元素的和并打印。
 */
public class Array3 {
    public static void main(String[] args) {
        Random random = new Random(100);
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int ran = random.nextInt(100);
            arr[i] = ran;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.err.println(sum);
    }
}
