package com.hainiu.Thread2;

public class Demo {
    public static void main(String[] args) {
        MyTicket tk = new MyTicket();

        new Thread(tk,"窗口一").start();
        new Thread(tk,"窗口二").start();


    }
}
