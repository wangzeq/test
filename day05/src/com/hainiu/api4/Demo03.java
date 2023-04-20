package com.hainiu.api4;

public class Demo03 {
    public static void main(String[] args) {

        System.exit(0);

        // 错误流
        for (int i = 0; i < 1000; i++) {
            System.out.println(1/0);
            System.err.println("sdfasdfsadf");
            System.out.println("01010101");
        }

    }
}
