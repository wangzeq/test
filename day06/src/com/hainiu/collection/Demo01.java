package com.hainiu.collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo01 {
    public static void main(String[] args) {

        // 创建集合对象
        ArrayList<String> list = new ArrayList<>(); // 当前集合只能存储字符串 泛型

        // 添加元素
        list.add("java");
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("big");
        list.add("abc");
        list.add("java");
        list.add("java");

        System.out.println(list);
//        list.clear();

//        list.remove("java");

         //如果满足条件删除
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 4;
            }
        });
        list.removeIf(s -> s.length() < 4);
        System.out.println(list);

        System.out.println(list.contains("javase"));

        System.out.println(list.isEmpty());

        System.out.println(list.size());

        // 打印集合对象


    }
}
