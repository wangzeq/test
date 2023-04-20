package com.hainiu;

public class work03 {
    public static void main(String[] args) {
        //水仙花数案例


        //设置计数器，起始为0
        int count = 0;
        //设置循环，从100到999的三位数中选择水仙花数
        for (int i = 100; i < 1000; i++) {
            //找到每个三位数的个、十、百、位数
            int ge = i%10;
            int shi = (i/10)%10;
            int bai = i/100;
            //设置水仙花数的满足条件
            if(Math.pow(ge,3)+Math.pow(shi ,3)+Math.pow(bai ,3)==i){
                System.out.println(i);
                //计数器+1
                count++;
            }
        }
        System.out.println("水仙花数共有："+count+"个");
    }
}
