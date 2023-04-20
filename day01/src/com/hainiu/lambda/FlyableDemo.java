package com.hainiu.lambda;

import java.sql.SQLOutput;

public class FlyableDemo {
    public static void main(String[] args) {
//        useFlyable(new Flyable(){
//            @Override
//            public void fly(String s) {
//                System.out.println(s);
//                System.out.println("开飞机");
//            }
//        });

        useFlyable((String s)-> {
            System.out.println(s);
            System.out.println("开飞机");
        });

    }

    private static void useFlyable(Flyable f){
        f.fly("晴空万里");
    }
}
