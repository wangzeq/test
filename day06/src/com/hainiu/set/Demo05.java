package com.hainiu.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo05 {
    public static void main(String[] args) {
        // TreeSet 第二种排序方式
        TreeSet<Teacher> set = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // o1 代表新元素  o2代表已有的元素
                int i = o1.getAge() - o2.getAge();
                if (i == 0) {
                    i = o1.getName().compareTo(o2.getName());
                }
                // 如果无需去重，那么保证这个返回值不为0即可
                /*
                if (i == 0) {
                    i = 1;
                }
                */
                return i;
            }
        });

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
