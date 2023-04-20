package com.hainiu.recourse;

/**
 * @author HaiNiu
 * @description 迷宫最优路线
 */
public class Demo03 {
    public static void main(String[] args) {

        System.out.println(mg(0, 0));
    }


    // 0，0    4，4
    public static int mg(int x, int y) {
        // 如果到达最右或者最下
        if (x == 4 || y == 4) {
            return 1;
        }
        // 某个点的最优路线 = 这个点右边的最优路线 + 这个点下边的最优路线
        return mg(x + 1, y) + mg(x, y + 1);
    }
}
