package com.hainiu;


import java.util.Scanner;

//20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
public class work10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入总金额：");
        int money = sc.nextInt();
        //可以直接买的瓶数
        int ping = money/3;
        //剩余的钱
        int yu = money%3;
        //剩余的钱加上空瓶子，一共换到的瓶数
        int p2=(yu+ping*1)/3;
        //总共的瓶数
        ping += p2;
        System.out.println("一共可以买"+ping+"瓶");

    }
}
