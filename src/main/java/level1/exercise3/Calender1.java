package com.study.exercise3;

import java.util.Calendar;

/**
 * 用程序判断2018年2月14日是星期几
 */
public class Calender1 {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(Calendar.YEAR,2018);
        rightNow.set(Calendar.MONTH,1);
        rightNow.set(Calendar.DAY_OF_MONTH,14);

        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH) + 1;
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int week = rightNow.get(Calendar.DAY_OF_WEEK);
        System.err.println(year + "年" + month + "月" + day + "日是星期" + week);
        int ear = rightNow.get(Calendar.ERA);
        System.err.println(ear);
    }
}
