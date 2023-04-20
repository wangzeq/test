package com.hainiu.api2;

public class Demo01 {
    public static void main(String[] args) {

        String str = "hello world ";

        str += "java";

        System.out.println(str);

        // 字符串不可变 所以会被共享
        String s1 = "hello world";
        String s2 = "hello world";
        System.out.println(s1 == s2);

        String s = new String("hello world"); // 几个对象？ 1个或2个
    }
}
