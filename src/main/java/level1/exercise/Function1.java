package com.study.exercise;

/**
 * 定义一个方法，该方法能够找出两个小数中的较小值并返回。
 * 在主方法中调用方法进行测试。
 */
public class Function1 {
    public static void main(String[] args) {
        System.err.println(getMin(10.3,20.1));
    }
    public static double getMin(double a,double b) {
        if(a > b) {
            return b;
        } else {
            return a;
        }
    }
}
