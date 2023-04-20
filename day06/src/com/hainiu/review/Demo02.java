package com.hainiu.review;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

try {
	可能出现异常的代码;
} catch(异常类名 变量名) {
	异常的处理代码;
}

捕获异常不但使得编译通过 如果出现异常，也不影响后续代码执行。


 */
public class Demo02 {

    public static void main(String[] args) {

        /*try {
            int[] arr = new int[3];
            System.out.println(arr[3]); // 出现异常的位置创建一个该异常的对象
        } catch (ArrayIndexOutOfBoundsException e) { // catch就捕获这个异常对象，try中其余的代码将不再执行 进入catch语句
            // 异常名称+信息
//            System.out.println(e.toString());
            // 简短信息
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("这里能执行吗");*/


        /*
        String str = "1999-09-09";
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM-dd");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
        */


        // 一个try语句可以跟多个catch语句
        try {
            Object obj = null;
            System.out.println(obj.hashCode());

            int[] arr = new int[3];
            System.out.println(arr[3]);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

}
