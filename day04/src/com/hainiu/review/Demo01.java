package com.hainiu.review;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        // 数组常见操作的工具类  Arrays  调用方法直接使用类名.

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int i = Arrays.binarySearch(arr, 5);
        System.out.println(i);

        // 在Arrays类中方法叫 copyOf  实际走的是System类arraycopy方法  这是用于数组扩容的方法
        // System类的方法
//        public static void arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
        /*
            src 源数组
            srcPos 源数组起始位置
            dest 目标数组
            destPos 目标数组起始位置
            length 拷贝长度
         */
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 1, newArr, 2, 5);

        System.out.println(Arrays.toString(newArr));

        // public static String toString(int[] a) -- 把数组元素拼成一个字符串返回

        // public static void sort(int[] a) -- 排序
        int[] array = {2, 5, 1, 8, 3, 4, 7};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
