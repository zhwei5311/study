package com.study.threadExe;

public class Producer implements Runnable {
    private Milk milk;
    public Producer(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            milk.put(i);
        }
    }
}
