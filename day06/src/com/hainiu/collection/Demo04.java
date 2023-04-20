package com.hainiu.collection;

import java.util.LinkedList;

public class Demo04 {
    public static void main(String[] args) {

        LinkedList<String> list =  new LinkedList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.addLast("ddd");
        list.addFirst("eee");

        System.out.println(list);

    }
}
