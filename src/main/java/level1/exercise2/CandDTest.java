package com.study.exercise2;

import java.util.ArrayList;

/**
 * 花色的波斯猫正在吃鱼.....
 * 花色的波斯猫正在逮老鼠....
 * 黑色的藏獒正在啃骨头.....
 * 黑色的藏獒正在看家.....
 */
public class CandDTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setColor("花色的");
        cat.setBreed("波斯猫");
        Dog dog = new Dog();
        dog.setColor("黑色的");
        dog.setBreed("藏獒");
//        System.err.print(cat.getColor() + cat.getBreed());
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
        ArrayList<Cat> arrayList = new ArrayList<>();
    }
}
