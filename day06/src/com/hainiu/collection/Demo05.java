package com.hainiu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05 {
    public static void main(String[] args) {
        
        // ArrayList 数组实现的列表
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(100);

        // 迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
        }
        System.out.println("------");
        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println("------");
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            System.out.println(num);
        }
    }
}
