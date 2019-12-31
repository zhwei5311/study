package com.study.CollectionExe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */
public class Collec1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for(int i = 0;i < 10; i++) {
            collection.add(i);
        }
        Object[] objects = collection.toArray();
        Iterator<Integer> iterator = collection.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.err.println(next);
        }

        for(int i = 0; i < objects.length; i++) {
            System.err.println(objects[i]);
        }
    }
}
