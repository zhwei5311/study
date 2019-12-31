package com.study.threadExe;

/**
 * 创建多线程对象，开启多线程。在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数。
 */
public class Exe1 {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo();
        threadDemo1.start();
        for(int i =1; i < 101; i++) {
            if(i % 2 == 1) {
                System.err.println("主线程：" + i);
            }
        }
    }
}
