package com.hainiu.oop8;

public class Test {
    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();


        // 内部类
        // 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
        /*Outer.Inner oi = new Outer().new Inner();
        oi.setName("hello");
        System.out.println(oi.getName());*/

        // 静态内部类的访问
        Outer.In oi = new Outer.In();
        oi.method();

        Outer.In.fun();

        Out out = new Out();
        out.test();

    }
}
