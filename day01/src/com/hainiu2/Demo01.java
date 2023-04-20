package com.hainiu2;

import java.util.Scanner;


// 评委打分案例    评委打分  键盘录入6个评委的分数（0~10），去掉一个最低分和最高分 其余取平均分 计算该选手最终得分。
public class Demo01 {
    public static void main(String[] args) {
        //键盘输入成绩
        Scanner sc = new Scanner(System.in);
        //定义数组储存成绩
        int arr[] = new int[6];

        //循环输入
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分:");
            int score = sc.nextInt();
            //输入成绩
            if (score <= 10 && score >= 0){
                arr[i] =score;
            }else{
                System.out.println("您输入的成绩有误，请重新输入:");
                i--;
            }
        }
        //最高分
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
//        System.out.println(max);

        //最低分
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
//        System.out.println(min);

        //计算总分
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
//        System.out.println(sum);

        //计算平均成绩
        double score2 = (sum-max-min)*1.0/(arr.length-2);
        System.out.println("最终成绩为:"+score2+"分");

    }
}
