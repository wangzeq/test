package com.hainiu.work;


import java.util.HashMap;

// "java world java javase big big data data data java hello world hello" 都是用空格分隔的
// 统计每个单词出现的次数。
public class work6 {
    public static void main(String[] args) {
        String str = "java world java javase    big big data data data java hello world hello";
        //用空格拆开
        String[] arr = str.split("\\s+");
        //定义map集合
        HashMap<String,Integer>map = new HashMap<>();

        for (String s : arr) {
            //是否包含键，是则s+1，不是则记录1
            map.put(s, map.containsKey(s) ? map.get(s)+1 :1);

        }
        //遍历
        map.forEach((k,v) -> System.out.println("单词"+k+"出现了"+v+"次"));
    }
}
