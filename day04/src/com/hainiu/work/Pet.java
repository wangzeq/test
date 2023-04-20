package com.hainiu.work;

public abstract class Pet {
    private String name;
    private String color;
    //定义用来实现的方法 ，drink
    public void drink() {

        System.out.println("颜色为：" + color + "的宠物：" + name + "正在喝水。。。");
    }
    //定义抽象方法
    public abstract void eat();

    //无参构造
    public Pet() {

    }
    //全参构造
    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
