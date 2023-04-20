package com.hainiu.oop10;

public class InterImp1 implements Inter{
    public void method(){
        int NUM = 20;
        System.out.println(NUM);
    }
    public void show(){
        System.out.println("子类实现show方法");
    }
}
