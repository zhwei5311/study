package com.study.exercise2;

/**
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
 * 比如：Hello12345World中字母：10个，数字：5个。
 */
public class API4 {
    public static void main(String[] args) {
        getCount("Hello12345World");
    }

    public static void getCount(String string){
        int small = 0;
        int num = 0;
        int[] arr = new int[3];
        for(int i = 0;i < string.length();i++) {
            char ch = string.charAt(i);
            if (ch >='a' && ch <= 'z'){
                small++;
            } else if(ch >='A' && ch <= 'Z') {
                small++;
            }else if(ch >='0' && ch <= '9') {
                num++;
            }
        }
        System.err.println("small" + small);
        System.err.println("num" + num);
    }
}
