package com.hainiu.regex;

public class Demo06 {
    public static void main(String[] args) {
        // 现得到如下的字符串：
        String s = "我..我....我.我...我.要.要...要...要..要...要.学..学.学...学.学.编...编.编..编...编...程程..程..程";
        // 请还原出其中的有效信息：我要学编程
        // 替换所有的点
        String s1 = s.replaceAll("\\.", "");
        System.out.println(s1);
        // 叠词规则 (.)\\1+   任意字符放入组中，引用这个字符至少一次
        String s2 = s1.replaceAll("(.)\\1+", "$1");// 替换中 第二个参数用$取第一个参数中的组
        System.out.println(s2);
    }
}
