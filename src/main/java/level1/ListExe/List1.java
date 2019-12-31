package com.study.ListExe;

import java.util.LinkedList;
import java.util.List;

/**
 * 根据要求练习LinkedList方法：
 * （1）基本方法：add, set, get, remove, clear, size等方法；
 * （2）特有方法：addFirst, addLast, getFirst, getLast, removeFirst, removeLast, push, pop, clear等方法
 */
public class List1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("刘大");
        list.add("胡三");
        list.add("贺六");
        list.add("王八");
        list.add("赵十一");
        list.add("白笑嫣");
        for (String string : list) {
            System.err.println(string);
        }
        System.err.println("-------------------");
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            list.set(0,"嘉靖");
//            if (i == 0) {
//                list.remove(i);
//            }
        }
        for (String string : list) {
            System.err.println(string);
        }
        System.err.println("-------------------");
        list.addFirst("朱香");
        for (String string : list) {
            System.err.println(string);
        }
        System.err.println("-------------------");
        list.addLast("贺世忠");
        for (String string : list) {
            System.err.println(string);
        }
        System.err.println("-------------------");
        String firstString = list.getFirst();
        System.err.println(firstString);
        String lastString = list.getLast();
        System.err.println(lastString);
        System.err.println("-------------------");
        String firstRemove = list.removeFirst();
        System.err.println(firstRemove);
        System.err.println("-------------------");
        String lastRemove = list.removeLast();
        System.err.println(lastRemove);
        System.err.println("-------------------");
        list.push("冯宝");
        String s = list.pop();
        System.err.println("s:" + s);
        System.err.println("-------------------");
        list.clear();
        for (String string : list) {
            System.err.println(string);
        }
        System.err.println("-------------------");
    }
}
