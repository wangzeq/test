package com.hainiu.oop1;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象使用
        Student stu = new Student(); // new关键字后面就是调用构造方法

        System.out.println(stu);

        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0

        // 使用属性：给属性赋值  获取属性的值
        stu.name = "Tom";
        stu.age = 20;

        System.out.println(stu.name); // Tom
        System.out.println(stu.age); // 20

        // 使用行为 调用方法
        stu.study();
        stu.eat();

        // 使用有参数的构造
        Student stu2 = new Student("Jerry", 21);
        System.out.println(stu2.name); //
        System.out.println(stu2.age); //

    }
}
