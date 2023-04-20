package com.hainiu.work;
//模拟用户登录

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        //定义字符串
        String username = "admin";
        String password = "123456";
        //设置键盘输入
        Scanner sc = new Scanner(System.in);
        //循环五次
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入用户名:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String word = sc.next();
            //判断用户名和密码是否正确
            if (name.equals(username) && word.equals(password)) {
                System.out.println("欢迎");
                break;
            }else {
                System.out.println("用户名或密码错误,请重新输入，还剩"+(5-i)+"次机会");
            }
        }

    }
}
