package com.study.exercise2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("IPHONE");
        phone.setColor("JET BLACK");
        phone.setPrice(5388);
        System.err.println(phone.getBrand());
        System.err.println(phone.getColor());
        System.err.println(phone.getPrice());
        phone.call();
        phone.sendMessage();
    }
}
