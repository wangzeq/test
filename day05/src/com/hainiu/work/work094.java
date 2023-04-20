package com.hainiu.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class work094 {
    public static void main(String[] args) {

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
