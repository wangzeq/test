package com.hainiu;
/*
一个小球从高处落下，落地后反弹的高度是原来高度的一半，然后再次落下。
请编写程序计算，如果小球的原始高度为100米，那么在第10次落地后，反弹高度是多少?
在第10次反弹到达最高点时，经过的总路程是多少?
 */
public class Test3 {
    public static void main(String[] args) {
        double height = 100;
        double sum1 =0;
        double sum2=0;
        for (int i = 0; i <10 ; i++) {
            sum1 += height;
            height = height/2;
            sum2 += height;
            System.out.println("第"+(i+1)+"次反弹高度为"+height+"米");

        }
        System.out.println("在第10次反弹到达最高点时，经过的总路程是"+(sum1+sum2)+"米");
    }
}
