package com.hainiu.sort;

import java.util.Arrays;

/**
 * @author HaiNiu
 * @description 快速排序
 */
public class Demo05_QuickSort {


    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 2, 3, 1, 5, 7, 8};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);

        System.out.println(Arrays.toString(arr));


    }

    /**
     * 快速排序的入口方法
     *
     * @param arr
     */
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 快速排序 挖坑法
     *
     * @param arr   待排序的数组
     * @param start 待排序的数组起始位置
     * @param end   待排序的数组结束位置
     */
    public static void quickSort(int[] arr, int start, int end) {
        // 出口
        if (start < end) {
            // 一轮排序的过程  基准值归位
            // 记录下来本轮参与排序的开始和结束位置
            int i = start;
            int j = end;
            // 记录本轮的基准值
            int pivot = arr[i];
            // 循环找到这个基准值的位置
            while (i < j) {
                // 从右边找比基准值小的元素
                while (arr[j] >= pivot && i < j) {
                    j--;
                }
                // 从右边找到的这个值放到基准值的位置
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                // 从左边找基准值大的元素
                while (arr[i] <= pivot && i < j) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }

            }
            // 整个while循环结束 基准值找到了位置 就是i  基准值归位
            arr[i] = pivot;

            // 递归
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }


    }

}
