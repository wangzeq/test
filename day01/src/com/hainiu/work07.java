package com.hainiu;

public class work07 {
    public static void main(String[] args) {
        //小牛买了一个存钱罐，他计划这样存钱：第一周存入10元，第二周存入20元，第三周存入30，依次每周递增10元。
        //  请编写程序帮助小牛计算一下，一年（一年52周）之后，他的存钱罐中有多少钱？

        //定义总金额
        int sum = 0;
        //设置循环，从第一周到第52周
        for (int i = 1; i <=52 ; i++) {
            int money = i*10;
            sum += money;

        }
        System.out.println("存钱罐中有"+sum+"元");
    }
}
