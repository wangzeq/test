package com.hainiu.regex;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        // 拆分 按照正则表达式规则拆分  结尾的空串不保留
        // public String[] split(String regex)
        /*String str = "aaa,bbb,ccc";
        String[] arr = str.split(",");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));*/

        /*String str = "aaa.bbb.ccc";
        String[] arr = str.split("\\."); // 转义
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));*/


        String str = "aaa,bbb,,,ccc,,";
        String[] arr = str.split(",");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
