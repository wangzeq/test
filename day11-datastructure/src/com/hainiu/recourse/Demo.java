package com.hainiu.recourse;

/**
 * @author HaiNiu
 * @description
 *
 * 5!
 * 阶乘：
 *      5! = 4! * 5
 *          4! = 3! * 4
 *              3! = 2! * 3
 *                  2! = 1! * 2
 *                  将简单问题的答案反推回去 得到原问题的答案
 *                  2
 *             3! = 6
 *          4! = 24
 *     5! = 120
 *
 *     注意：
 *      出口 -- 递归停止分解的条件
 *      规律 -- 如何分解
 *
 * 注意：递归的层级不能太深。
 */
public class Demo {


    public static void main(String[] args) {

        int num = jc(5);
        System.out.println(num);

    }

    // 递归求n的阶乘
    public static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n - 1);
    }
}
