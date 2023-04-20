package com.hainiu.oop7;

// 手机类 定义各种类型手机的共同特征
public abstract class Phone {

    private String brand;
    private double price;

    // 抽象方法
    public abstract void call(String name);

    public void open() {
        System.out.println("启动设备");
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
