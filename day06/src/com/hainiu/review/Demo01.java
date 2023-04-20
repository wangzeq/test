package com.hainiu.review;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {

        String s = "11 110   20  25  18  17  15  22"; // 空格分隔

        // 拆分
        String[] strArr = s.split("\\s+");

        // 字符串数组 转 整数数组
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        // 排序
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 转成字符串 涉及字符串的频繁改变
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
            if (i < arr.length - 1) {
                builder.append(" ");
            }
        }
        // 得到
        System.out.println(builder.toString());
    }
}
