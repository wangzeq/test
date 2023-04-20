package com.hainiu.enumdemo;

/**
 * @author HaiNiu
 * @description
 */
public class SingletonTest {
    public static void main(String[] args) {

       /* HungerSingleton instance1 = HungerSingleton.getInstance();
        HungerSingleton instance2 = HungerSingleton.getInstance();

        System.out.println(instance1 == instance2);*/

       /* DoubleCheckedSingleton s1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton s2 = DoubleCheckedSingleton.getInstance();*/


        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DoubleCheckedSingleton s = DoubleCheckedSingleton.getInstance();
                System.out.println(s);
            }).start();
        }



    }
}
