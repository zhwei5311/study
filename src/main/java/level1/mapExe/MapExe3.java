package com.study.mapExe;

import java.util.*;

/**
 * 请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
 */
public class MapExe3 {
    public static void main(String[] args) {
        Map<Car,Double> map = new HashMap<>();
        Car car1 = new Car("吉利");
        Car car2 = new Car("奇瑞");
        Car car3 = new Car("路虎");
        map.put(car1,10000.0);
        map.put(car2,30000.0);
        map.put(car3,130000.8);
        Set<Car> carSet = map.keySet();
        for(Car car : carSet) {
            System.err.println(car.getBrand() + ": " + map.get(car));
        }
    }
}
