package com.hainiu.generic;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("hello");
        list.add(100);
        list.add(true);


        for (Object o : list) {
            System.out.println((String) o);
        }
    }
}
