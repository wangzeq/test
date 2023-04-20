package com.hainiu;

public class Demo4 {
    public static void main(String[] args) {
        double s=0.1;
        int count = 0;
        while (s <= 8848430){
            s *=2;
            count ++;
            System.out.println(s);
        }
        System.out.println(count);
    }
}
