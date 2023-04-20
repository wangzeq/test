package com.hainiu.set;

import java.util.TreeSet;

public class Demo03 {

    public static void main(String[] args) {

        // 对元素进行排序  字符串的默认顺序是字典顺序
        TreeSet<String> set = new TreeSet<String>();
        
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("javase");
        set.add("javaee");
        set.add("java");

        for (String s : set) {
            System.out.println(s);
        }

    }
    
}
