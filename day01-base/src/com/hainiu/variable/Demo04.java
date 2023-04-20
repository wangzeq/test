package com.hainiu.variable;

/*
alt + enter
    代码修复快捷键

 */
public class Demo04 {
    public static void main(String[] args) {

        double x = 5.5;

        int y = (int) x;

        System.out.println(y);


        // java 中 参与运算的多个值 类型必须统一 如果不统一 都自动转换为大的

        System.out.println('a' + 0);

        // 强制类型转换的结果可能并不是我们想要的  慎重
        byte b = (byte) 200;
        System.out.println(b);
    }
}
