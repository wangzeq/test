package com.hainiu.demo;

public class Chopsticks {
    private  int num;

    public Chopsticks() {
    }

    public Chopsticks(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Chopsticks{" +
                "num=" + num +
                '}';
    }
}

