package com.hainiu;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int x = sc.nextInt();
        int a = x%10;
        int b = (x/10)%10;
        int c = x/100;
        System.out.println(c+b+a);
    }

}
