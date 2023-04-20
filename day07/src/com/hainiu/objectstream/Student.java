package com.hainiu.objectstream;

import java.io.Serializable;

// Serializable序列化接口  标识型接口  实现这个接口的类 对象可以被序列化和反序列化操作
public class Student implements Serializable {
    private String name;


    // 瞬态关键字  被他修饰的成员变量 不参与序列化过程
    private  int age;

//    private String id; // 学号

    // serialVersionUID 当修改了类时，序列化版本号发生变化
    // 提供一个固定的序列化版本号  去字符串类拷贝
    private static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
