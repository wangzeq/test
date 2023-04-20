package com.hainiu;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int x = sc.nextInt();

        System.out.println("请输入第二个数:");
        int y = sc.nextInt();

        System.out.println("请输入第三个数:");
        int z = sc.nextInt();

        int t = x > y ? x : y;
        int m = t > z ? t : z;
        System.out.println("最大值为："+m);
    }
}
