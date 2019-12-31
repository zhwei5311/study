package com.study.threadExe;

public class GetNameByRaunnable implements Runnable {
    @Override
    public void run() {
        System.err.println(Thread.currentThread().getName());
    }
}
