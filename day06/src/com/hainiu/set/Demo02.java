package com.hainiu.set;

import java.util.HashSet;

public class Demo02 {
    public static void main(String[] args) {
        // HashSet如何保证元素唯一

        /*
            1、元素存入集合时，需要与已经存在的元素进行比较；
                两个对象先进行哈希比较，如果哈希值不同，一定不相等，直接存
                如果哈希值相同，再执行equals比较
                    如果equals返回true，元素重复，不添加
                    如果equals返回false，元素不重复，添加
            hashCode 提高哈希表性能的

            HashSet存储元素，保证不重复，需要重写hashCode和equals方法。

         */
        HashSet<Student> set = new HashSet<Student>();

        Student s1 = new Student("貂蝉", 18);
        Student s2 = new Student("西施", 17);
        Student s3 = new Student("王昭君", 19);
        Student s4 = new Student("杨玉环", 16);
        Student s5 = new Student("西施", 17);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        for (Student stu : set) {
            System.out.println(stu);
        }

    }
}
