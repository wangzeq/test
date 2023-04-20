package com.hainiu;

import com.sun.xml.internal.bind.util.Which;
import jdk.nashorn.internal.ir.WhileNode;

public class work08 {
    /*
    森林里有一只熊怪，很爱吃核桃。
  不过它有个习惯，每次都把找到的核桃分成相等的两份，吃掉一份，留一份。
  如果不能等分，熊怪就会扔掉一个核桃再分。第二天再继续这个过程，直到最后剩一个核桃了，直接丢掉。
  有一天，熊怪发现了1543个核桃，请问，它在吃这些核桃的过程中，它一共要丢掉多少个核桃。
     */
    public static void main(String[] args) {
        //定义核桃总数
        int ht = 1543;
        //设置计数器
        int count = 0;

        //设置循环条件
        while(ht>0){
            //设置条件语句，不能等分时，丢掉一个
            if (ht%2==1){
                System.out.println(ht);
                ht--;
                count++;

            }else {
                //能等分时，等分
                ht /=2;
            }
        }
        System.out.println("总共丢掉"+count+"个核桃");
    }

}
