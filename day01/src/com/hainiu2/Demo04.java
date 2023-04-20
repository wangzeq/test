package com.hainiu2;
//二分查找


public class Demo04 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        //调用方法并赋值
        int s = serch(arr,66);
        System.out.println(s);
    }

    //定义方法
    public static int serch(int[] arr, int key) {
        //定义起始点和终点的索引位置
        int start = 0;
        int end = arr.length-1;
        //设置循环，当起始点小于终点时，可以正常查找
        while (start<=end){
            //定义中间值的索引
            int mid = (start+end)/2;
            //当关键字小于中间值时
            if(key<arr[mid]){
                end=mid-1;
            //当关键字大于中间值时
            }else if(key>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        //查找不到，返回-1
        return -1;
    }
}