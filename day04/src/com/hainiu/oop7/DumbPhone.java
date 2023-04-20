package com.hainiu.oop7;

public class DumbPhone extends Phone implements Help {

    public DumbPhone() {
    }

    public DumbPhone(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }

    @Override
    public void help() {
        System.out.println("一键呼救");
    }
}
