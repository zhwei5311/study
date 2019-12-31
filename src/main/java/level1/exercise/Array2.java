package com.study.exercise;

/**
 * 现有一个小数数组{12.9,53.54,75.0,99.1,3.14}。请编写代码，找出数组中的最小值并打印。
 */
public class Array2 {
    public static void main(String[] args) {
        double[] arr = new double[]{12.9,53.54,75.0,99.1,3.14};
        double min = arr[0];
        for(int i = 1;i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.err.println(min);
    }
}
