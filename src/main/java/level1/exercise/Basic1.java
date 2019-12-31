package com.study.exercise;

/**
 * 通过键盘录入的方式输入星期数(1-7的整数)，显示今天的减肥活动，使用switch和if两种判断语句分别完成。
 * ?            周一：跑步
 * ?            周二：游泳
 * ?            周三：慢走
 * ?            周四：动感单车
 * ?            周五：拳击
 * ?            周六：爬山
 * ?            周日：好好吃一顿
 */
public class Basic1 {
    public static void main(String[] args) {
        int i = 3;
        switch(i) {
            case 1: {
                System.err.println("跑步");
                break;
            }
            case 2: {
                System.err.println("游泳");
                break;
            }
            case 3: {
                System.err.println("慢走");
                break;
            }
            case 4: {
                System.err.println("动感单车");
                break;
            }
            case 5: {
                System.err.println("拳击");
                break;
            }
            case 6: {
                System.err.println("爬山");
                break;
            }
            case 7: {
                System.err.println("好好吃一顿");
                break;
            }
            default: {
                System.err.println("数字有误，请重新输入！");
            }
        }
    }
}
