package com.study.mapExe;

import java.util.HashMap;
import java.util.Map;

/**
 * - 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
 *   - 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class MapExe6 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer value = map.get(key);
            if(value == null) {
                map.put(key,1);
            } else {
                value++;
                map.put(key,value);
            }
        }
        for(Character key : map.keySet()) {
            System.err.println(key + ": " + map.get(key));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Character key : map.keySet()) {
            stringBuilder.append(key).append("(").append(map.get(key)).append(")");
        }
        String s1 = stringBuilder.toString();
        System.err.println(s1);
    }
}
