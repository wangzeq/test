package com.hainiu.Thread;

public class MyTicket implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        //买票
        while(true) {


            synchronized (this) {
                if(ticket <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第"+ticket+"张票");
                ticket--;
            }

        }

    }
}
