package com.bora.produce.service.impl;

public class Father {
    static {
        System.err.println("super --> static");
    }
    public static int n = 10;
    public int x = 100;

    public Father() {
        System.err.println("super's x = " + x);
        age();
    }
    public void age() {
        System.err.println("nothing");
    }
    public void printX() {
        System.err.println("x = " + x);
    }
}
