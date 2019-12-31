package com.study.CollectionExe;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
 */
public class Collec2 {
    public static void main(String[] args) {
        Collec2 collec2 = new Collec2();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        boolean b = collec2.listTest(arrayList,"123");
        System.err.println();
    }
    public boolean listTest(ArrayList<String> al, String s) {
        if(al.contains(s)) {
            return true;
        }
        return false;
    }

    public boolean myIsEmpty(ArrayList<String> al) {
        if(al.isEmpty()) {
            return true;
        }
        return false;
    }
}
