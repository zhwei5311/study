package com.example.zhwei;

import java.util.HashMap;
import java.util.Map;

/**
 * Ticket: NumCount
 *
 * @author zhwei
 * @email zhwei5311@gmail.com
 * @Date: 2022/4/7 23:24
 */
public class NumCount {
    public static void main(String[] args) {
        int n = 2;
        Map<Integer, Integer> zeroMap = new HashMap<>();
        Map<Integer, Integer> oneMap = new HashMap<>();
        zeroMap.put(1, 1);
        oneMap.put(1, 1);
        for (int i = 2; i <= n; i++) {
            Integer zeroCount = zeroMap.get(i - 1);
            Integer oneCount = oneMap.get(i - 1);
            zeroMap.put(i, zeroCount + oneCount);
            oneMap.put(i, zeroCount);
        }
        System.out.println(zeroMap.get(n));
        System.out.println(oneMap.get(n));
        System.out.println(zeroMap.get(n) + oneMap.get(n));
    }
}
