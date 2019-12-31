package com.study.exercise;

/**
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 */
public class Basic9 {
    public static void main(String[] args) {
        int[] arr = new int[]{68,1,95,88,100,51};
        System.err.println(getSum(arr));
        System.err.println(getMax(arr));
        System.err.println(getMin(arr));
        int avg = (getSum(arr) - getMax(arr) - getMin(arr)) /(arr.length - 2);
        System.err.println(avg);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
}
