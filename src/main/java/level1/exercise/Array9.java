package com.study.exercise;

public class Array9 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.err.print("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.err.print(arr[i]);
            } else {
                System.err.print(arr[i] + ",");
            }
        }

        System.err.print("]");
    }
}
