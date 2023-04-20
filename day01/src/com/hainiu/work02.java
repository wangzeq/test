package com.hainiu;

import java.util.Scanner;

public class work02 {

    //对输入的成绩作出判断 属于哪个等级

    public static void main(String[] args) {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        //设置循环，使得一直输入正确成绩为止
        while (true){
            System.out.println("请输入成绩为：");
            int score = sc.nextInt();
            //对于成绩所在的区间进行划分
            if (score>0 && score<=100){
                if(score>=90 && score<=100){
                    System.out.println("此成绩为A");
                    break;//跳出循环
                }else if(score>=80 && score<90){
                    System.out.println("此成绩为B");
                    break;
                }else if(score>=70 && score<80) {
                    System.out.println("此成绩为C");
                    break;
                }else if(score>=60 && score<70) {
                    System.out.println("此成绩为D");
                    break;
                }else {
                    System.out.println("此成绩不及格");
                    break;
                }
            }
            //不在成绩合理区间的，则成绩有误，重新输入
            else
                System.out.println("成绩输入有误，请重新输入");
        }

    }
}
