package com.hainiu.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        
        // <T> T[] toArray(T[] a)
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        // 数组
        String[] arr = new String[list.size()];
        // 转成指定类型的数组
        list.toArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
