package com.study.exercise;

/**
 * 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
 * 四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
 */
public class Function7 {
    public static void main(String[] args) {
        System.err.println(myRound(3.54));
    }

    public static int myRound(double d) {
        int result = (int)d % 10;
        int i = (int)(d * 10 % 10);
        if(i > 4) {
            result += 1;
        }
        return result;
    }
}
