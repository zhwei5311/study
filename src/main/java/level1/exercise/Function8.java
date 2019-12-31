package com.study.exercise;

import java.util.Random;

/**
 * 一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
 * 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）
 * <p>
 * ```
 * 888元的奖金被抽出
 * 588元的奖金被抽出
 * 10000元的奖金被抽出
 * 1000元的奖金被抽出
 * 2元的奖金被抽出
 * ```
 */
public class Function8 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,588,888,1000,10000};
        int[] brr = new int[arr.length];
        Random random = new Random(5);
        int index = 0;
        while(index < arr.length) {
            int ran = random.nextInt(arr.length);
            boolean b = prize(brr,arr[ran]);
            if(!b) {
                brr[index] = arr[ran];
                index++;
                System.err.println(arr[ran]);
            }
        }
    }
    public static boolean prize(int[] brr,int a) {
        for(int i = 0;i < brr.length;i++) {
            if(brr[i] == a) {
                return true;
            }
        }
        return false;
    }
}
