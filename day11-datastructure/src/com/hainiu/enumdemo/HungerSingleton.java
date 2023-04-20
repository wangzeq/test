package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description 饿汉式单例设计模式
 */
public class HungerSingleton {

    // 不能对外提供构造器
    private HungerSingleton(){}

    // 自己创建这个唯一的对象
    private static HungerSingleton singleton = new HungerSingleton();

    // 公共的方法 提供这个唯一的对象
    public static HungerSingleton getInstance() {
        return singleton;
    }

    // 其他方法

}
