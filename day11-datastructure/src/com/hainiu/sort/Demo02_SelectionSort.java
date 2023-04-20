package com.hainiu.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author HaiNiu
 * @description 选择排序
 */
public class Demo02_SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
//        int count = 0;
        // 外层循环控制总的比较轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环负责在本轮参与排序的元素中查找最小值出现的索引
            int mark = i; // 本轮的第一个元素
            for (int j = i + 1; j < arr.length; j++) {
                // 找到更小的值 记录这个索引
                if (arr[j] < arr[mark]) {
                    mark = j;
                }
            }
            // 本轮的最小值出现的索引
            if (mark != i) {
                Demo01_BubbleSort.swap(arr, mark, i);
//                count++;
            }
        }
//        System.out.println(count);
    }
}
