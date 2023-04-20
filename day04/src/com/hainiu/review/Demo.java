package com.hainiu.review;

import java.util.Arrays;

/*
一个数组，一个开始索引 fromIndex，一个长度 len，实现的目标是从该索引fromIndex位置获取，一共获取len个元素，组成一个新数组

获取数组的一部分
    int[] arr, int fromIndex, int len
    int[]

 */
public class Demo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] array = getSubArray(arr, 1, 5);
        System.out.println(Arrays.toString(array));

    }

    public static int[] getSubArray(int[] arr, int fromIndex, int len) {
        // 从原数组 fromIndex索引开始 遍历len个元素 存入新数组
        int[] newArr = new int[len];
        for (int i = fromIndex; i < fromIndex + len; i++) {
            newArr[i - fromIndex] = arr[i];
        }
        return newArr;
    }


}
