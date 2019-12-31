package com.study.threadExe;

public class MilkDemo {
    public static void main(String[] args) {
        Milk milk = new Milk();

        Producer producer = new Producer(milk);
        Customer customer = new Customer(milk);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(customer);

        thread1.start();
        thread2.start();
    }
}
