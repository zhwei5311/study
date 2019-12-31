package com.study.ListExe;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()
 */
public class List4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Collection<Integer> collection = ArrToColl(arr);
        System.err.println(collection);
        System.err.println("---------------------");
        for(Integer integer : collection) {
            System.err.println(integer);
        }
    }
    public static Collection<Integer> ArrToColl(int[] arr) {
        Collection<Integer> collection = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            collection.add(arr[i]);
        }
        return collection;
    }
}
