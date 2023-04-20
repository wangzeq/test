package com.hainiu.work;

import java.util.Arrays;

public class work093 {
    public static void main(String[] args) {
        String str = "11 22   33  44     55";
        // 按照一个或多个空白字符拆分
        String[] strs = str.split("\\s+");
        // [11, 22, 33, 44, 55]
        System.out.println(Arrays.toString(strs));
    }
}
