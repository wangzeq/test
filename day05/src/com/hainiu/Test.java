package com.hainiu;

import java.util.Random;

//请获取10个1~100(包含边界)范围内的随机数，存入数组中
//1、遍历数组查看其中的元素
//2、找出数组中的最大值输出到控制台
public class Test {
    public static void main(String[] args) {

        Random r = new Random();
        int []arr = new int[10];
        for (int i = 0; i < 10; i++) {
            //数组中的随机数元素
            arr[i] = r.nextInt(100);
            System.out.println(arr[i]);
        }
        System.out.println("---------");
        //找出最大值
        int max = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为:"+max);

    }
}
