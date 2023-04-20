package com.hainiu.api4;

public class Demo01 {
    public static void main(String[] args) {

        Integer i1 = new Integer(10);
        System.out.println(i1);

        Integer i2 = new Integer("10");
        System.out.println(i2);

        // 包装类 对象 能够调用功能

        Integer num = 100; // 自动将基本数据类型包装为对象
        System.out.println(num);

        num += 200; // 自动的将对象转换为基本数据类型
        // num = num + 200; // new Integer(num.intValue() + 200)
        System.out.println(num);

//        Integer i = null;

        Integer in = Integer.valueOf(100);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 掌握字符串与整数之间的互换 "10" 10  转谁就找谁

        // public static int parseInt(String s)
        int x = Integer.parseInt("123");
        System.out.println(x);

        String s = String.valueOf(100);
        System.out.println(s);

    }
}
