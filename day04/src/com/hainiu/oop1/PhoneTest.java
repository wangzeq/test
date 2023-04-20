package com.hainiu.oop1;

public class PhoneTest {
    public static void main(String[] args) {

        // 创建对象
        Phone p = new Phone();
        System.out.println(p);
        p.brand = "iphone";
        // 直接访问成员变量是不安全的
//        p.price = -2000;

        p.setPrice(-2000);

        System.out.println(p.brand);
//        System.out.println(p.price);
        System.out.println(p.getPrice());

    }
}
