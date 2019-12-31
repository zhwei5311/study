package com.study.exercise;

/**
 * 有一个整数数组。请编写代码，让数组的最后一个元素代表个位，倒数第二个元素代表十位，以此类推。最终得到一个大的整数。比如：
 * <p>
 * ```
 * 原数组：{1,2,3,4,5}
 * 最终得到的结果： 12345
 * ```
 */
public class Array4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            score += (arr[i] * Math.pow(10, (arr.length - i - 1)));
        }
        System.err.println(score);
    }
}
