package com.hainiu.work2;

public class SmartPhone extends Phone {
    @Override
    public void call(String name) {
        System.out.println("给" + name + "打视频电话");
    }

    public void play() {
        System.out.println("智能机可以玩游戏");


    }
}