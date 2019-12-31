package com.study.exercise;

/**
 * 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
 * （可以创建其他数组，不必须在原数组中改变）
 */
public class Array8 {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr1 = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr1[left] = arr[i];
                left++;
            } else {
                arr1[right] = arr[i];
                right--;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.err.print(arr1[i] + " ");
        }
    }
}
