package com.hainiu;

public class work06 {
    public static void main(String[] args) {
        //九九乘法表

        //设置外循环 行数
        for (int i = 1; i <=9 ; i++) {
            //设置内循环  列数
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");      //用制表符间隔
            //行数换行
            }System.out.println();
        }
    }
}
