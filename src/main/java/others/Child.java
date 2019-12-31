package com.bora.produce.service.impl;

public class Child extends Father {
    static {
        System.err.println("child --> static");
    }
    private static int n = 20;
    {
        n = 30;
    }
    public int x = 200;

    public Child() {
        this("the other constructor");
        System.err.println("child constructor body: " + n);
    }

    public Child(String s) {
        System.err.println(s);
        age();
    }
    public void age() {
        System.err.println("age = " + n);
    }
    public void printX() {
        System.err.println("x = " + x);
    }

    public static void main(String[] args) {
        new Child().printX();
    }
}
