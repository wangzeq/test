package com.hainiu.work;

import java.util.Random;
import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //设置死循环，直到输入城谷
        while (true){
            System.out.println("系统生成的验证码为:");
            //调用code
            String code = code();
            System.out.println(code);

            System.out.println("请输入验证码:");
            String str = sc.nextLine();
            //判断验证码输入是否正确
            if(code.equalsIgnoreCase(str)){
                System.out.println("验证通过");
                break;
            }else{
                System.out.println("验证码输入错误，刷新验证码，请重新输入:");
            }
        }



    }

    public static String code(){
        //用String存储所有符合的字符
        String str = "";
        for (char i = 'a';i <= 'z'; i++) {
            str += i;
        }
        for (char i = 'A'; i <='Z' ; i++) {
            str += i;
        }
        for (char i = '0'; i <='9' ; i++) {
            str += i;
        }

        //四次循环，获得四个索引
        String code ="";
        Random random = new Random();
        for (int i = 0; i <4 ; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            code += c;
        }
        return code;
    }
}
