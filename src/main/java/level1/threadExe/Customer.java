package com.study.threadExe;

public class Customer implements Runnable {
    private Milk milk;
    public Customer(Milk milk) {
        this.milk = milk;
    }
    @Override
    public void run() {
        while(true) {
            milk.get();
        }
    }
}
