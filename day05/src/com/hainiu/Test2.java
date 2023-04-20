package com.hainiu;

import java.util.Scanner;

//请输入一个字符串，统计这个字符串中的英文字符和数字字符分别出现多少个
public class Test2 {

    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段文本:");
        String x = sc.nextLine();
        //计数器
        int count = 0;
        //循环查找英文字符
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if ((c >= 'a' && c <= 'z')|| (c >= 'A' && c <='Z')) {
                count++;
            }

        }
        System.out.println("英文字符个数为"+count+"个");

        int count2=0;
        //循环查找数字字符
        for (int i = 0; i <x.length() ; i++) {
            char d = x.charAt(i);
            if (d >='0'&& d <= '9') {
                count2++;
            }

        }
        System.out.println("数字字符个数为"+count2+"个");


    }





}
