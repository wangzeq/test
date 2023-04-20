package com.hainiu.oop7;

public class SmartPhone extends Phone implements PlayGame {

    // 屏幕尺寸
    private String size;

    public SmartPhone() {

    }

    public SmartPhone(String brand, double price, String size) {
        super(brand, price);
        this.size = size;
    }

    @Override
    public void call(String name) {
        System.out.println("给" + name + "打视频电话");
    }

    @Override
    public void play() {
        System.out.println("智能机可以玩游戏");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
