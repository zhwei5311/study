package com.study.exercise3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日
 */
public class Date2 {
    public static void main(String[] args) {
        String date = "2018-03-04";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date d = null;
        try {
            d = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dateString = sdf.format(d);
        System.err.println(dateString);
    }
}
