package com.hainiu;

import java.util.Scanner;
//三元运算符获取三个数的最大值

public class work01 {
    public static void main(String[] args) {

        //键盘输入
        Scanner sc = new Scanner(System.in);
        //依次输入三个数
        System.out.println("请输入第一个数：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数：");
        int y = sc.nextInt();
        System.out.println("请输入第三个数：");
        int z = sc.nextInt();
        //用三元运算符对比三个数字,选出最大值
        int t = x > y ? x : y;
        int m = t > z ? t : z;
        //输出最大值
        System.out.println("三个数中的最大值为:"+m);

    }
}
