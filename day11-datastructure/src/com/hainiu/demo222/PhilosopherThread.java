package com.hainiu.demo222;


public class PhilosopherThread extends Thread {

    private Chopsticks left;

    private Chopsticks right;

    private int index;

    public PhilosopherThread(Chopsticks left, Chopsticks right, int index) {
        this.left = left;
        this.index = index;
        this.right = right;
    }

    @Override
    public void run() {

        if (index % 2 == 0) {
            synchronized (right) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(index + "等待获取筷子LEFT进行吃饭");
                synchronized (right) {
                    System.out.println(index + "获取筷子LEFT进行吃饭");
                }
            }
        } else {
            synchronized (left) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(index + "等待获取筷子RIGHT进行吃饭");
                synchronized (right) {
                    System.out.println(index + "获取筷子RIGHT进行吃饭");
                }
            }
        }

    }
}