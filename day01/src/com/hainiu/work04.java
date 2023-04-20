package com.hainiu;

public class work04 {
    public static void main(String[] args) {
        //折纸超过珠峰

        //定义珠峰的高度
        int zf = 8844430;
        //定义纸张厚度
        double h = 0.1;
        //设置计数器
        int count = 0;

        //设置循环条件
        while (h <= zf){
            //纸张厚度翻倍
            h *= 2;
            //计数器加1
            count++;
            //输出当前纸张厚度
            System.out.println(h);
        }
        //输出折叠次数
        System.out.println("总共折叠"+count+"次");


    }
}
