package com.hainiu.regex;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {

        // 手机号
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("请输入手机号：");
            String phone = sc.nextLine();

            // 规则
            String regex = "1[3|5-9]\\d{9}";

            // 匹配
            boolean b = phone.matches(regex);
            System.out.println(b);
        }

        // QQ 5  15位数字
        String qqRegex = "[1-9]\\d{4,14}";

        String id = "[1-9]\\d{16}[0-9Xx]";

    }
}
