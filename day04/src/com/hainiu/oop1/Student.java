package com.hainiu.oop1;

// 该类用于描述学生信息
public class Student {

    // 属性  成员变量
    String name;
    int age;

    // 行为  成员方法
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void eat() {
        System.out.println("干饭人");
    }

    // 构造方法
    // 如果没有给出任何的构造方法 那么系统默认给出一个无参数的  一旦给出了构造方法 那么默认构造就不存在了
    // 给对象都属性进行初始化的
    public Student() {
        System.out.println("构造方法执行了");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
