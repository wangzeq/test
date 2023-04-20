package com.hainiu.oop4;

// 宠物类
public abstract class Pet {

    private String name;
    private String color;

    // 具体实现的方法：供子类继承使用的，也可以被子类重写
    public void drink() {
        System.out.println("颜色为：" + color + "的宠物：" + name + "正在喝水。。。");
    }

    // 抽象的方法：要求子类必须按照某种规则做事情
    public abstract void eat();

    public Pet() {
    }

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
