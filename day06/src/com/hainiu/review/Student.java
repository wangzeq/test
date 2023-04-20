package com.hainiu.review;

/*
自定义异常：
1、定义一个异常类 继承自异常体系的一员（通常继承自RuntimeException）
2、起个好名字 自定义的异常名称
3、根据父类提供两个构造


 */
public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // 对年龄控制
    public void setAge(int age) {
        if (age >= 18 && age <= 35) {
            this.age = age;
        } else {
            // 如果传递的参数不合适 抛出一个异常  new 异常对象  使用throw关键字抛出
//            new AgeOutOfBoundsException("the age must be between 18 and 35");
            throw new AgeOutOfBoundsException("年龄必须在18到35之间");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
