package com.study.streamExe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 已知数组arr1中有如下元素{郭靖，杨康}，
 * arr2中有如下元素{黄蓉，穆念慈}，
 * 使用Stream将二者合并到List集合
 */
public class Exe7 {
    public static void main(String[] args) {
        String[] arr1 = {"郭靖","杨康"};
        String[] arr2 = {"黄蓉","穆念慈"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        Stream<String> stream = Stream.concat(stream1, stream2);
        List<String> collect = stream.collect(Collectors.toList());
        collect.forEach(System.err::println);
    }
}
