package com.hainiu;

import java.util.Random;
import java.util.Scanner;

public class work05 {
    //猜数字小游戏

    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        //生成一个随机数
        Random random = new Random();
        //设置随机数区间(1-100)
        int num=random.nextInt(100)+1;

        //设置循环，直到猜对为止
        while (true){
            System.out.println("请输入你猜的数字:");
            int n = sc.nextInt();

            //判断所猜数字的大小
            if (n > num){
                System.out.println("猜大了，请继续");
            }else if(n < num){
                System.out.println("猜小了，请继续");
            }else{
                System.out.println("恭喜你，猜对了！");
                //猜对之后，跳出循环
                break;
            }
        }

    }

}
