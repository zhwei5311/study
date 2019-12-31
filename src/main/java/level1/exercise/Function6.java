package com.study.exercise;

/**
 * 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。
 * 请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
 */
public class Function6 {
    public static void main(String[] args) {
        System.err.println(myAbs(-5.8));
        System.err.println(myAbs(3.14));
    }
    public static double myAbs(double a) {
        if(a > 0) {
            return a;
        } else {
            return -a;
        }
    }
}
