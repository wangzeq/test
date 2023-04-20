package com.hainiu.variable;

/*
ctrl + alt + l
    格式化代码

 */
public class Demo05 {
    public static void main(String[] args) {
        int a = 10;
        if (a > 10) {
            System.out.println();
        }

/*
十进制：Java中，数值默认都是10进制，不需要加任何修饰。
二进制：数值前面以0b开头，b大小写都可以。
八进制：数值前面以0开头。
十六进制：数值前面以0x开头，x大小写都可以。\


100
50  0
25  0
12  1
6   0
3   0
1   1
0   1

13 原码 反码 补码
0 000 1101

0000 0000

1000 0000
1111 1111
(1)0000 0000


-13 原码
1 000 1101
反码
1 111 0010
补码 = 反码 + 1
1 111 0011


计算机中 有符号整数，都是通过二进制补码进行存储和运算的。

int类型200的补码：
0000 0000 0000 0000 0000 0000 1100 1000
转换为byte
1100 1000
最高位变为1 负数，反推原码
-1
1100 0111
1011 1000
-56

强制类型转换是通过截取补码得到的。

*/
        System.out.println(0b1100100);
        System.out.println(0127);
        System.out.println(0x3c);

        String s = Integer.toBinaryString(-200);
        System.out.println(s);

        System.out.println((byte) 200);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        if (a > 10) {
            System.out.println();
        }
    }
}
