package com.study.exercise;

/**
 * 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
 *
 * ```
 * 请输入第一个整数：10
 * 请输入第二个整数：30
 * 请输入第三个整数：20
 * 从大到小的顺序是： 30 20 10
 * ```
 */
public class Function5 {
    public static void main(String[] args) {
        mySort(30,20,10);
    }
    public static void mySort(int a,int b, int c) {
        int max = 0;
        int min = 0;
        if(a > b && a > c) {
            max = a;
        }else if(b > a && b > c) {
            max = b;
        } else if(c > a && c > b) {
            max = c;
        }
        if(a < b && a < c) {
            min = a;
        } else if(b < a && b < c) {
            min = b;
        } else if(c < a && c < b) {
            min = c;
        }
        int mid = a + b + c - min - max;
        System.err.print(max + " " + mid + " " + min);
    }
}
