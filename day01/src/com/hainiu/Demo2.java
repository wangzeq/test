package com.hainiu;

public class Demo2 {
    public static void main(String[] args) {
    //需求，攒钱，第一周10，第二周20，...一年后（52）周，能有多少钱
        int money = 0;
        for (int i = 10; i <= 520; i+=10) {
            money += i;
        }
        System.out.println(money);
    }
}
