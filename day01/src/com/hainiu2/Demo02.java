package com.hainiu2;
//数组反转

public class Demo02 {
    public static void main(String[] args) {
        //定义静态化数组
        int[]arr = {11,22,33,44,55,66,77};
        //倒着遍历
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print(arr[i]+"\t");

        //定义起始点和终点
        int start = 0;
        int end = arr.length-1;
        //起点小于终点 便交换元素
        while (start<end){
            int x = arr[start];
            arr[start]=arr[end];
            arr[end]=x;
            start++;
            end--;
        }
        //遍历交换完元素之后的数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
    }
}
