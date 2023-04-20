package com.hainiu.work2;
//同样设置抽象类
public abstract class Phone {

    private String brand;
    private String price;

    //抽象方法
    public abstract void call(String name);

    public void open(){
        System.out.println("开机");
    }


    public Phone() {
    }

    public Phone(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
