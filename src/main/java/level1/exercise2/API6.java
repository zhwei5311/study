package com.study.exercise2;

/**
 * 我国的居民身份证号码，由十七位数字本体码和一位数字校验码组成。
 * 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
 * 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class API6 {
    public static void main(String[] args) {
        boolean b = isOK("12345678901234567X");
        System.err.println(b);
    }
    public static boolean isOK(String str) {
        if(str == null) {
            return false;
        }
        if(str.startsWith("0")) {
            return false;
        }
        if(str.length() != 18) {
            return false;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(i == str.length() - 1) {
                if(ch < '0' || ch > '9' && ch != 'X') {
                    return false;
                }
            } else {
                if(ch < '0' || ch > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
