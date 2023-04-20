package com.hainiu.set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("hello");
        set.add("java");
        set.add("javase");
        set.add("hello");
        set.add("world");
        set.add("java");

        System.out.println(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("**********");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
