package com.hainiu.regex;

public class Demo03 {
    public static void main(String[] args) {

        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        // 隐藏电话号
        String regex = "1[3-9]\\d{9}";

        // 替换
        String s = str.replaceFirst(regex, "****");

        System.out.println(s);
        System.out.println("=============");

        String word = "你T M   D别送了，塔都T M       D没了";
        String r = "T\\s*M\\s*D";

        String s1 = word.replaceAll(r, "****");
        System.out.println(s1);

    }
}
