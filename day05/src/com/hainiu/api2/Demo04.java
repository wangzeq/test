package com.hainiu.api2;

import java.io.StringReader;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // 比较方法
        // 模拟用户登录
        String username = "admin";
        String password = "123456";

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        // 循环 5次
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String word = sc.nextLine();
            // 判断
            if (username.equals(name) && password.equals(word)) {
                System.out.println("欢迎");
                break;
            } else {
                System.out.println("用户名或密码错误，请重新输入，还剩"+(5-i)+"次机会");
            }
        }

    }
}
