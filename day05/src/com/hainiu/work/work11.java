package com.hainiu.work;

import java.util.Arrays;

//String s = "11 110   20  25  18  17  15  22"
//    将其中的整数按照大小排序（Arrays.sort()）,组成一个新的字符串。
//    拆分成字符串数组
//    字符串数组转换为整数数组
//    排序
//    再把整数数组拼接成字符串（StringBuilder）
public class work11 {
    public static void main(String[] args) {
        String s = "11 110 20 25 18 17 15 22";
        //切割字符串；将字符串切割成字符串数组，用String类的split方法：String[] split(String regex)；
        String []ss = s.split(" ");
        //动态初始化数组
        int[] arr = new int[ss.length];
        //遍历字符串数组个数
        for (int i = 0; i < arr.length; i++) {
            //将数字字符转化成数字
            arr[i] = Integer.parseInt(ss[i]);
        }

         Arrays.sort(arr);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        //将数组转化成字符串
        String arr1 = sb.toString();
        System.out.println(arr1);

    }
}
