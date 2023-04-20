package com.hainiu.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
1、运行时异常无需声明
2、声明一个编译时异常，可以使得编译通过。如果出现，后续代码还是无法执行。

 */
public class Demo01 {
    public static void main(String[] args) throws ParseException {

        /*// 运行时异常 非受检异常
        System.out.println(1/0);

        System.out.println(11);*/


//       stringToDate();

    }

    // 自己不处理，将异常抛给调用者来处理
    public static Date stringToDate() throws ParseException {
        String str = "1999-09-09";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(str);
        return date;
    }

}
