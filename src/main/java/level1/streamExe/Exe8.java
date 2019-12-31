package com.study.streamExe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

/**
 * 请分别写出获取并发流的两种方式
 */
public class Exe8 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        Stream<String> parallelStream = collection.parallelStream();
        Stream<Integer> parallelStream2 = Stream.of(100, 200, 300, 400).parallel();
    }
}
