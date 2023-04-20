package com.hainiu.set;

import java.util.TreeSet;

public class Demo04 {

    public static void main(String[] args) {

        // 对元素进行排序  字符串的默认顺序是字典顺序
        TreeSet<Teacher> set = new TreeSet<Teacher>();

        Teacher t1 = new Teacher("Tom老师", 20);
        Teacher t2 = new Teacher("Tony老师", 21);
        Teacher t3 = new Teacher("John老师", 19);
        Teacher t4 = new Teacher("Jack老师", 20);
        Teacher t5 = new Teacher("Tom老师", 20);

        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);

        for (Teacher t : set) {
            System.out.println(t);
        }

    }
    
}
