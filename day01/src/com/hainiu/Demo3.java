package com.hainiu;

public class Demo3 {
    public static void main(String[] args) {
        double zf = 8848430;
        double paper = 0.1;
        int count = 0;
        while (paper<= zf){
            paper *=2;
            count ++;
        }
        System.out.println(count);
    }
}
