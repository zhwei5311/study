package com.study.CollectionExe;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
 */
public class Collec4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =1;i < 6; i++) {
            list.add(i);
        }
        System.err.println(listTest(list, 5));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        for(int i = 0; i < al.size();i++) {
            if(al.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
