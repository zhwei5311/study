package com.study.exercise;

/**
 * 通过键盘录入两个整数n和m。n代表行数，m代表列数。
 * 定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：
 *
 * ```
 * 请输入行数：
 * 4
 * 请输入列数：
 * 5
 * @@@@@
 * @@@@@
 * @@@@@
 * @@@@@
 * ```
 */
public class Function3 {
    public static void main(String[] args) {
        graph(4,5);
    }
    public static void graph(int n,int m) {
        for(int i=0;i < n;i++) {
            for(int j=0;j < m; j++) {
                System.err.print("@");
            }
            System.err.println();
        }
    }
}
