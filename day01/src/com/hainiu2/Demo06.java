package com.hainiu2;

import java.nio.channels.ServerSocketChannel;

/*
定义方法实现，获取数组的一部分，
（需要的参数是：一个数组，一个开始索引 fromIndex，一个长度 len，实现的目标是从该索引fromIndex位置获取，一共获取len个元素，组成一个新数组）
 */
public class Demo06 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int fromIndex = 1;
        int len = 4;
        serch(arr,fromIndex,len);
    }


    public static void serch(int[] arr, int fromIndex,int len){

        //循环，遍历
        for (int i = fromIndex; i <fromIndex+len; i++) {
            //从指定缩影开始遍历
            System.out.println(arr[i]);
            }
        }



}
