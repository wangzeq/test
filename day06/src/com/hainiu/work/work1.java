package com.hainiu.work;
//定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）

import java.util.ArrayList;
import java.util.Iterator;

public class work1 {
    public static void main(String[] args) {
        //定义集合，存储字符
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("k");
        list.add("4");
        list.add("7");

        //根据索引遍历
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
//            System.out.println(s);

        }
        System.out.println(list);
        System.out.println("=============");

        //foreach
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(list);
        System.out.println("=============");

        //迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
        System.out.println(list);

    }
}
