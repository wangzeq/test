package com.hainiu.oop9;


public class Demo {

    public static void main(String[] args) {

        /*
        new 类名/接口名() {
            // 重写父类或者父接口中的方法
        }
        // 本质：new出来的是继承了类或者实现了接口的匿名子类对象
         */
        new Inter() {
            @Override
            public void hello() {
                System.out.println("hello 匿名内部类");
            }
        }.hello();

//        new Student().eat(); // 匿名对象只能用一次

//        创建子类对象使用
        new InterImpl().hello();

        Inter i = new Inter() {
            @Override
            public void hello() {
                System.out.println("hello 匿名内部类");
            }
        };
        i.hello();

    }
}
