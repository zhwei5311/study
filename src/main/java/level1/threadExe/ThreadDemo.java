package com.study.threadExe;

/**
 * 在子线程中输出1-100之间的偶数，主线程输出1-100之间的奇数
 */
public class ThreadDemo extends Thread {
    @Override
    public void run() {
        for(int i =1; i < 101; i++) {
            if(i % 2 == 0) {
                System.err.println("子线程：" + i);
            }
        }
    }
}
