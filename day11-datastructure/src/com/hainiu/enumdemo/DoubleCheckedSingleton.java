package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description 懒汉式单例设计模式  双重检查锁
 */
public class DoubleCheckedSingleton {

    private DoubleCheckedSingleton() {}

    // 声明本类的一个对象
    private static DoubleCheckedSingleton singleton = null;

    // 访问时创建
    public static DoubleCheckedSingleton getInstance() {

        if (singleton == null) {
            // 如果对象为空，加锁
            synchronized (DoubleCheckedSingleton.class) {
                // 如果对象为空 创建对象
                if (singleton == null) {
                    singleton = new DoubleCheckedSingleton();
                }
            }
        }
        return singleton;
    }

}
