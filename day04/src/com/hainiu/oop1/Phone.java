package com.hainiu.oop1;

// 描述手机对象的信息  javabean - 一个简单的事物描述类
public class Phone {

    // 属性 成员变量
    String brand;
    private double price;

    // private 私有的

    // 行为
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信 我是秦始皇 打钱~");
    }

    // 提供方法实现对成员变量的访问
    // 给属性赋值  获取属性的值
    public void setPrice(double price) {
        // 使用局部变量price给成员变量price赋值
        if (price < 0) {
            System.out.println("价格不合法");
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        System.out.println(this);
        return this.price;
    }
}
