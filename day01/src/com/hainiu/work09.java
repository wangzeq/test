package com.hainiu;

public class work09 {
    public static void main(String[] args) {
        //1 2 3 4 四个数据，从中选择3个数字 组成一个三位数，要求选择的数字不重复。这样的三位数有多少个？

        //设置计数器
        int count = 0;
        //分别找出三个数字，组成一个三位数
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                for (int k = 1; k <=4 ; k++) {
                    //要求所选的三个数字不重复
                    if (i!=j&&i!=k&&j!=k){
                        System.out.print(""+i+j+k+"\t");
                        count++;
                    }
                }
            }
        }System.out.println("共组成不重复的三位数"+count+"个");


        
    }
}
