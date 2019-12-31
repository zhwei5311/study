package com.study.threadExe;

public class GetName extends Thread {
    @Override
    public void run() {
        System.err.println("子线程的名称：" + currentThread().getName());
    }
}
