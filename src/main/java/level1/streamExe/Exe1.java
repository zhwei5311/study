package com.study.streamExe;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 1.    请在测试类main方法中完成以下需求
 * 已知有Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213}
 * a)    使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数(大于等于0)
 * b)    使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
 * c)    使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
 *
 *     遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
 * i.    打印自然数的个数
 * ii.    打印负整数的个数
 * iii.    打印绝对值大于100的偶数的个数
 * iv.    打印是负整数或偶数的数的个数
 */
public class Exe1 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0,-38,-7758520,941213};

        Predicate<Integer> predicate1 = a -> a >= 0;
        Predicate<Integer> predicate2 = a -> Math.abs(a) > 100;
        Predicate<Integer> predicate3 = a -> a % 2 == 0;

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (Integer integer : arr) {
            if(predicate1.test(integer)) {
                count1++;
            }

            if(predicate1.negate().test(integer)) {
                count2++;
            }

            if(predicate2.and(predicate3).test(integer)) {
                count3++;
            }

            if(predicate1.negate().or(predicate3).test(integer)) {
                count4++;
            }
        }
        System.err.println(count1);
        System.err.println(count2);
        System.err.println(count3);
        System.err.println(count4);

        Stream.of(arr).filter(a -> a >= 0).forEach(System.out::println);
    }

    public static boolean checkInteger1(Integer integer, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        return predicate1.or(predicate2).test(integer);
    }

    public static boolean checkInteger2(Integer integer, Predicate<Integer> predicate) {
        return predicate.test(integer);
    }
}
