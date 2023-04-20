package com.hainiu.work;
// 键盘录入一个字符串 统计其中的英文字母有多少个？


import java.util.Scanner;

public class work02 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一段文本:");
        //键盘输入文本
        String s = sc.nextLine();
        //设置计数器
        int count = 0;
        //循环遍历
        for (int i = 0; i < s.length(); i++) {
            //将找到的字符赋予c
            char c = s.charAt(i);
            //判断找到的字符是否是英文
            if ((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')) {
                count++;
            }
        }
        System.out.println("共找到"+count+"个英文字符");
    }
}
