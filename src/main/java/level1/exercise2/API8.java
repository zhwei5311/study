package com.study.exercise2;

/**
 * 现有如下文本：
 * "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的"。
 * 请编写程序，统计该文本中"Java"一词出现的次数。
 */
public class API8 {
    public static void main(String[] args) {
//        8、在主方法中，定义字符串表示题目中的文本，定义字符串表示要查找的子串，调用方法，获取结果。
        System.err.println(getCount("Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的","Java"));
    }
//        1、定义方法，返回值int表示次数，参数列表两个字符串，第一个表示在哪个字符串中查找，第二个表示要查找的目标子串
    public static int getCount(String str1,String str2) {
//        2、定义统计变量表示次数。
        int count = 0;
//        3、定义索引变量，表示每次找到子串出现的索引。
        int index;
//        4、定义循环，判断条件为在字符串中找到了目标子串，使用indexOf实现。
        for(int i = 0; i < str1.length(); i++) {
//        5、如果找到的索引不是-1，在循环中，统计变量累加。
            if((index = str1.indexOf(str2)) != -1) {
                count++;
//        6、把查找过的部分剪切掉，从找到的索引+子串长度的位置开始截取，使用substring实现。
                str1 = str1.substring(index + str2.length());
            }
        }
//        7、将次数返回
        return count;
    }
}
