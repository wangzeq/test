package com.hainiu.oop5;

public class InterTest {
    public static void main(String[] args) {

//        Inter inter = new Inter();
//        Inter.num = 20;
        System.out.println(Inter.NUM);

        InterImpl ii = new InterImpl();
        ii.show();
        ii.fun();

    }
}
