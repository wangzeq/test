package com.hainiu.oop5;

public interface Test {

    // 由接口的子类对象调用的 被实现子类重写
    default void show() {
        System.out.println("default show");
    }


    // 接口名直接调用
    static void method() {
        System.out.println("static method");
    }

    // jdk9 加入私有方法
    /*private void test() {

    }
    */
}
