package com.study.exercise;

/**
 * 设计一个方法，用于比较两个数组的内容是否相同
 */
public class Basic6 {
    public static void main(String[] args) {
        int[] arr = new int[]{68,27,95,88,171,996,51,210};
        int[] brr = new int[]{68,27,95,88,171,996,51,210};
        if(arr.length != brr.length) {
            System.err.println("不同");
        } else {
            for(int i=0;i<arr.length;i++) {
                if(arr[i] != brr[i]) {
                    System.err.println("不同");
                } else {
                }
            }
            System.err.println("相同");
        }
    }
}
