package com.hainiu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        list.add("java");
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("big");
        list.add("abc");
        list.add("java");
        list.add("java");
        list.add("java");

        // iterator 方法   获取迭代器   Collection体系的集合都可以使用迭代器遍历
        Iterator<String> it = list.iterator();

        // 判断是否有下一个元素
        while (it.hasNext()) {
            // 获取下一个元素
            String s = it.next();
            System.out.println(s);
        }
//        while(it.hasNext()){
//            String s = it.next();
//            if("java".equals(s)){
//                //指向谁,那么此时就删除谁.
//                it.remove();
//            }
//        }
        System.out.println(list);
    }
}
