package com.study.exercise;

/**
 * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据。
 * 定义一个方法，完成查找该数据在数组中的索引，并在控制台输出找到的索引值。
 */
public class Basic7 {
    public static void main(String[] args) {
        int[] arr = new int[]{19, 28, 37, 46, 50};
        int x = 30;
        System.err.println(getIndex(arr,x));
    }

    public static int getIndex(int[] arr,int x) {
        int a = -1;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == x) {
                a = i;
            }
        }
        return a;
    }
}
