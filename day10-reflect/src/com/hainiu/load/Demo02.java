package com.hainiu.load;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {

    static {
        x = 20;
    }

    private static int x = 10; // 默认初始化为0，静态代码块赋值为20，又被显式赋值为10

    public static void main(String[] args) {

        System.out.println(x);

    }

}
