package com.hainiu.review;

public class Test03 {
    public static void main(String[] args) {
        // 高度
        double height = 100;
        // 总路程
        double sum = 0;

        // 落地10次
        for (int i = 1; i <= 10; i++) {
            // 下落
            sum += height;
            // 下次的高度
            height /= 2;
            // 反弹
            sum += height;
        }
        System.out.println(height);
        System.out.println(sum);
    }
}
