package com.hainiu.regex;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

        String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = sc.nextLine();

        if (email.matches(regex)) {
            System.out.println("校验通过");
        } else {
            System.out.println("邮箱有误");
        }
    }
}
