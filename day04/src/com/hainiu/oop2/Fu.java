package com.hainiu.oop2;

// Obejct类是java中所有类的父类 基类 超类   子类： 衍生类 派生类
public class Fu extends Object {

    public Fu() {
        System.out.println("父类构造方法执行");
    }

    int num = 10;

    public void show() {
        System.out.println("Fu show");
    }
}
