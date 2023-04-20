package com.hainiu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数：");
//        int x = sc.nextInt();
//        System.out.println("请输入第二个数：");
//        int y = sc.nextInt();
//        int cha =x>y? x-y:y-x;
//        System.out.println(cha);

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int x = sc.nextInt();
        System.out.println("请输入第二个数");
        int y = sc.nextInt();
        int cha = x > y ? x-y:y-x;
        System.out.println("两数之差为:"+cha);

    }

}
