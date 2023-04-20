package com.hainiu.demo222;


public class Demo01 {

    public static void main(String[] args) {
        Chopsticks chopsticks1 = new Chopsticks();
        Chopsticks chopsticks2 = new Chopsticks();
        Chopsticks chopsticks3 = new Chopsticks();
        Chopsticks chopsticks4 = new Chopsticks();
        Chopsticks chopsticks5 = new Chopsticks();

        PhilosopherThread philosopherThread1 = new PhilosopherThread(chopsticks1, chopsticks2, 1);
        PhilosopherThread philosopherThread2 = new PhilosopherThread(chopsticks2, chopsticks3, 2);
        PhilosopherThread philosopherThread3 = new PhilosopherThread(chopsticks3, chopsticks4, 3);
        PhilosopherThread philosopherThread4 = new PhilosopherThread(chopsticks4, chopsticks5, 4);
        PhilosopherThread philosopherThread5 = new PhilosopherThread(chopsticks5, chopsticks1, 5);
        philosopherThread1.start();
        philosopherThread2.start();
        philosopherThread3.start();
        philosopherThread4.start();
        philosopherThread5.start();
    }
}

