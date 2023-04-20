package com.hainiu.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo05 {
    public static void main(String[] args) {
        /*// 将正则表达式编译 获取一个模式对象
        Pattern pattern = Pattern.compile("a*b");// ab aab aaab b

        // 通过模式对象获取某个字符串的匹配器
        Matcher matcher = pattern.matcher("aaaab");

        // 整体匹配
        boolean b = matcher.matches();
        System.out.println(b);*/

        Pattern pattern = Pattern.compile("1[3-9]\\d{9}");
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        Matcher matcher = pattern.matcher(str);
        // 查找
       while (matcher.find()) {
           String s = matcher.group();
           System.out.println(s);
       }
    }
}
