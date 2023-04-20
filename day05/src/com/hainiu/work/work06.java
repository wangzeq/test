package com.hainiu.work;
//判断一个字符串是否是回文


public class work06 {
    public static void main(String[] args) {


        String str = "1234321";
        System.out.println(isRev(str));

    }

    // 校验对称字符串 回文


    public static boolean isRev(String s){
        StringBuilder sb = new StringBuilder(s);
        //反转
        sb.reverse();
        String s1 = s.toString();
        //与原串相比
        return s.equals(s1);
    }

}
