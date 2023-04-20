package com.hainiu.work3;

public class Test {
    public static void main(String[] args) {

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳");
            }
        });

    }
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
