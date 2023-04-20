package com.hainiu.collection;

import java.util.ArrayList;

public class Demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1, "ddd");
//
//        list.remove(2);

//        list.set(1, "eee");
//
//        System.out.println(list.get(1));
//        System.out.println(list);

        // 根据索引可以遍历list集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println(list);
        System.out.println("-----------");
//        foreach语句  凡是能使用迭代器遍历的集合   增强for

        for (String s : list) {
            // 直接使用s即可
            System.out.println(s);
        }
        System.out.println("-----------");

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("----");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
