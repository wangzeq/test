package com.hainiu.api3;

// Stringbuiler 如何扩容
/*
如果使用空参构造，默认容量16
如果使用带字符串参数的构造，默认容量是字符串长度+16；

当添加数据时，如果超出容量，就会扩容
    扩容到原来容量的2倍+2
    如果新容量够用，就使用新容量
    如果不够用，就使用最小容量（之前的数据长度+本次添加到数据长度）

 */
public class Demo01 {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s.length());

        System.out.println("-----");
        StringBuilder s2 = new StringBuilder("java");
        System.out.println(s2);
        System.out.println(s2.capacity());
        System.out.println(s2.length());

        System.out.println("-------");
        // 如何扩容
        // 添加数据
        s.append("hello");
        s.append("world");
        s.append("bigdatabigdatabigdatabigdata");
        System.out.println(s);
        System.out.println(s.capacity());

    }
}
