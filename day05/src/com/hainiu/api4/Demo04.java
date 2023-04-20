package com.hainiu.api4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        // Sat Apr 01 15:49:36 CST 2023
        System.out.println(date);

        // 格式化成字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); // 2023-05-05 11:11:11
        // format
        String s = sdf.format(date);
        System.out.println(s);


        // 把字符串解析成日期对象
        String str = "1999-09-09 11:11:11";
        // SimpleDateFormat 格式必须按照字符串的格式进行编写
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = sdf2.parse(str);
        System.out.println(date2);


      /*  int year = date.getYear();
        System.out.println(year);*/
    }
}
