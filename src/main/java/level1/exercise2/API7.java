package com.study.exercise2;

/**
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。
 *
 * 要求：
 *     1、如果传递的参数为空，返回null
 *     2、如果传递的数组元素个数为0，返回[]
 *     3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 */
public class API7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.err.println(print(arr));
    }

    public static String print(int[] arr) {
        if(arr == null) {
            return null;
        }
        String str = "";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("[");
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i] + ",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
