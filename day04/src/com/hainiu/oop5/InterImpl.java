package com.hainiu.oop5;

// 类实现了接口
public class InterImpl extends Object implements Inter  {
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void fun() {
        System.out.println("fun");
    }
}
