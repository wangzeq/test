package com.hainiu.work;
//HashSet 存储几个学生对象，要求如果对象的所有属性都相同就认为是重复。并遍历结果。

import java.util.HashSet;

public class work3 {
    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<Student>();

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四", 17);
        Student s3 = new Student("王五", 19);
        Student s4 = new Student("赵六", 16);
        Student s5 = new Student("张三", 18);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        for (Student stu:set ){
            System.out.println(stu);
        }

    }
}
