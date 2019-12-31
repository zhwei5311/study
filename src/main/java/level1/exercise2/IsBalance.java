package com.study.exercise2;

/**
 * 请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。
 * 例如："abcba"、"上海自来水来自海上"均为对称字符串。
 */
public class IsBalance {
    public static void main(String[] args) {
        boolean b = isEqual("上海自来水来自海上");
        System.err.println(b);
    }
    public static boolean isEqual(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        String reverseString = stringBuilder.reverse().toString();
        if(string == null) {
            return false;
        }
        return string.equals(reverseString);
    }
}
