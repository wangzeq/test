package com.hainiu.recourse;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(hn(5));
    }

    public static int hn(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * hn(n - 1) + 1;
    }
}
