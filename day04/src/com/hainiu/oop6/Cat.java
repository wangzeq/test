package com.hainiu.oop6;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void play() {
        System.out.println("小猫玩游戏");
    }
}
