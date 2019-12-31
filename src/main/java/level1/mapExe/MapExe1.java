package com.study.mapExe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 请使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作
 */
public class MapExe1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"贺六");
        map.put(2,"白笑嫣");
        map.put(3,"贺世忠");
//        String s1 = map.remove(3);
//        System.err.println(s1);
        String s2 = map.get(1);
        System.err.println(s2);
        Set<Integer> keySet = map.keySet();
        for(Integer i : keySet) {
            System.err.println(i + ": " + map.get(i));
        }
    }
}
