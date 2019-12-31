package com.study.exercise;

/**
 * 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
 * 再通过键盘录入一个整数数字。55
 * 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。
 */
public class Array6 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int a = 55;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < a) {
                newArr[i] = arr[i];
            } else {
//                newArr[i] = a;
                newArr[i + 1] = arr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] == 0) {
                newArr[i] = a;
            }
            System.err.print(newArr[i] + " ");
        }
    }
}
