package com.hainiu.sort;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_BubbleSort {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8, 8, 8, 6, 3};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    /**
     * 冒泡排序
     * @param arr 要排序的数组
     */
    public static void bubbleSort(int[] arr) {
        // 总的排序轮数是长度-1次
        for (int i = 0; i < arr.length - 1; i++) {
            // 相邻元素比较 -1为了避免索引越界 -i为了缩小排序的范围
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 前面的大 就交换
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 交换数组两个索引位置上的元素
     *
     * @param arr 待操作的数组
     * @param i 交换的第一个索引
     * @param j 交换的第二个索引
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
