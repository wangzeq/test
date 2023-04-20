package com.hainiu.Test;

public class Test3 {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("铁汁, 我们去游泳吧");
            }
        });
    }

    public static void goSwimming(Swimming swimming){

//            Swimming swim = new Swimming() {
//                @Override
//                public void swim() {
//                    System.out.println("铁汁, 我们去游泳吧");
//                }
//            };

        swimming.swim();
    }

}
