package com.hainiu2;
//二维数组遍历，求年度营业额

public class Demo05 {
    public static void main(String[] args) {
        //定义营业额
        int[][] arr = {{10, 11, 15}, {22, 33, 44}, {55, 66, 50}, {10, 8, 9}};
        //定义年度营业额
        int year=0;
        //进入循环累加
        for (int i = 0; i <arr.length ; i++) {
            int season = 0;
            //季度的营业额累加
            for (int j = 0; j <arr[i].length ; j++) {

                season += arr[i][j];

            }
            System.out.println("第"+(i+1)+"季度的营业额为:"+season);
            year += season;

        }
        System.out.println("年度营业额为:"+year);

    }


}
