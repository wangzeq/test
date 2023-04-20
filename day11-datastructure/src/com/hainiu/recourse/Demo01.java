package com.hainiu.recourse;

/**
 * @author HaiNiu
 * @description 斐波那契数列   1	1	2	3	5	8	13	21	...
 * <p>
 * 从第三项开始 每一项是前两项的和
 */
public class Demo01 {

    public static void main(String[] args) {
        System.out.println(fb(50));
    }

    // 递归求斐波那契的第n项
    public static int fb(int n) {
        // 前两个月兔子已知
        if (n == 1 || n == 2) {
            return 1;
        }
        // 规律从第三项开始 每一项是前两项的和
        return fb(n - 2) + fb(n - 1);
    }

}
