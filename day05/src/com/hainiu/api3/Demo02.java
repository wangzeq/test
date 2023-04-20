package com.hainiu.api3;

/*

一段很长的文本：
    查找符合要求（是英文字母或者空格）的连续子串，最长的那个。

    sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world

    记录找到的每个子串，与之前找到的比较。

 */
public class Demo02 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        s.append("java"); // 追加
        System.out.println(s);
        s.insert(1, "world"); // 指定位置插入
        System.out.println(s);

        s.append(100).append(200).append(300); // 链式编程

        System.out.println(s);

        String str = "12344321";
        System.out.println(isRev(str));


    }
    // 校验对称字符串 回文
    public static boolean isRev(String s) {
        // 转成StringBuilder操作
        StringBuilder sb = new StringBuilder(s);
        // 反转
        sb.reverse();
        // 转回来
        String s1 = sb.toString();
        // 与原串比较
        return s.equals(s1);

//        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
