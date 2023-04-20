package com.hainiu.reflect;

/**
 * @author HaiNiu
 * @description 可变参数 参数类型一致 但个数任意
 */
public class Demo05_var {

    public static void main(String[] args) {
        // 方便参数传递
        System.out.println(add(1));
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));

        System.out.println(add());
//        System.out.println(add(null));

        int[] arr = new int[]{1, 2, 3};
        System.out.println(add(arr));

    }

    
    public static int add(int... values) {
        // 可变参数本质就是一个数组
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }
    
    /*public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }*/

    /*public static int add(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }*/
}
