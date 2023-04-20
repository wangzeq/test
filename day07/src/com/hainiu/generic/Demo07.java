package com.hainiu.generic;

import java.util.ArrayList;

/*
泛型擦除：
    泛型是一种编译期的安全检查机制。
    在运行期没有泛型，会将泛型擦除，数据类型仍然要提升为Object类型，这时数据的转换是安全的，当获取元素时，又会自动转回原来的类型。

往泛型声明为String的集合中存入一个Integer数据。 反射。

 */
public class Demo07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

//        list.add(100);

        list.add("hello");
        list.add("hello");
        list.add("hello");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
