package com.hainiu.generic;

import java.util.ArrayList;

public class Demo05 {
    public static void main(String[] args) {

        // 创建一个集合 泛型为Fu
        ArrayList<Fu> list1 = new ArrayList<>();

        list1.add(new Fu());
        list1.add(new Fu());

        // 创建一个集合 泛型为Zi
        ArrayList<Zi> list2 = new ArrayList<>();
        list2.add(new Zi());
        list2.add(new Zi());

        // 将list2中所有元素都添加到list1中
        // public boolean addAll(Collection<? extends E> c)
        list1.addAll(list2);

        for (Fu fu : list1) {
            System.out.println(fu);
        }
    }
}
