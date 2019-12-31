package com.study.streamExe;

import java.util.stream.Stream;

/**
 * 有如下整数1，-2，-3，4，-5
 * 使用Stream取元素绝对值并打印
 */
public class Exe6 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,-2,-3,4,-5);
        stream.map(Math::abs).forEach(System.err::println);
    }
}
