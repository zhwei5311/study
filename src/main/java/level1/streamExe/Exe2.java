package com.study.streamExe;

import java.util.*;
import java.util.function.Function;

/**
 * 1.    使用lambda表达式分别将以下功能封装到Function对象中
 * a)    求Integer类型ArrayList中所有元素的平均数
 * b)    将Map<String,Integer>中value存到ArrayList<Integer>中
 * 2.    已知学生成绩如下
 * 姓名    成绩
 * 岑小村    59
 * 谷天洛    82
 * 渣渣辉    98
 * 蓝小月    65
 * 皮几万    70
 */
public class Exe2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(59);
        list.add(82);
        list.add(98);
        list.add(65);
        list.add(70);
        Function<Integer, OptionalDouble> function1 = integer -> list.stream().mapToInt(Integer::intValue).average();
        OptionalDouble apply = null;
        for (Integer integer : list) {
            apply = function1.apply(integer);
        }
        System.err.println(apply.getAsDouble());

        System.err.println("-----------------------");

        Map<String,Integer> map = new HashMap<>();
        map.put("岑小村",59);
        map.put("谷天洛",82);
        map.put("渣渣辉",98);
        map.put("蓝小月",65);
        map.put("皮几万",70);

//        将Map<String,Integer>中value存到ArrayList<Integer>中
        Set<String> keySet = map.keySet();
//        List<Integer> valueList = new ArrayList<>();
//        for(String key : keySet) {
//            valueList.add(map.get(key));
//        }
        Function<Map<String,Integer>,ArrayList<Integer>> function2 = maps -> {
                ArrayList<Integer> lists = new ArrayList<>();
                Collection<Integer> values = maps.values();
                lists.addAll(values);
                return lists;
        };
        function2.apply(map).forEach(
                System.out::println
        );

    }
}
