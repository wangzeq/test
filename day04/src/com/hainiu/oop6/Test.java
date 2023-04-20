package com.hainiu.oop6;

/*

同一个对象，在不同时刻表现出来的不同形态。
- 要有继承或实现关系
- 要有方法的重写（也能形成多态，但是无意义）
- 要有父类引用指向子类对象

 */
public class Test {

    public static void main(String[] args) {
        // 父类引用接收子类对象
        Fu fu = new Zi();

        System.out.println(fu.num); // 10

        fu.test();

    }

}
