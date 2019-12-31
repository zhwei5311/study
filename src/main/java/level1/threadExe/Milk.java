package com.study.threadExe;

public class Milk {
    private int milk;
    private boolean state = false;
    public synchronized void put(int milk) {
        if(state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.err.println("生产出第" + this.milk + "瓶牛奶");
        state = true;
        notifyAll();
    }

    public synchronized void get() {
        if(!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println("消费了第" + this.milk + "瓶牛奶");
        state = false;
        notifyAll();
    }
}
