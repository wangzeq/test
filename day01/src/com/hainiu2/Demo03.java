package com.hainiu2;
//普通查找


public class Demo03 {

    public static void main(String[] args) {
        //定义数组
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        //定义要查找的值
        int key = 55;
        //定义索引
        int index = -1;
        //设置循环，
        for (int i = 0; i <arr.length ; i++) {
            //当找到对应的值时，记录其索引
            if (arr[i]==key){
                index=i;
                break;
            }
        }System.out.println(index);
    }
}
