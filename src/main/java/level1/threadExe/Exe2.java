package com.study.threadExe;

/**
 * 请编写程序，分别打印主线程的名称和子线程的名称。
 *     要求使用两种方式实现：
 *         第一种方式：继承Thread类。
 *         第二种方法：实现Runnable接口
 */
public class Exe2 {
    public static void main(String[] args) {
//        GetName getName = new GetName();
//        getName.start();
//
//        System.err.println("主线程的名字：" + Thread.currentThread().getName());

        GetNameByRaunnable gnbr = new GetNameByRaunnable();
        Thread thread = new Thread(gnbr);
        thread.start();
        System.err.println("主线程的名字：" + Thread.currentThread().getName());
    }
}
