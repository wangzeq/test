package com.hainiu.lambda;

public class Demo01 {

    public static void main(String[] args) {
        useEatable(() -> {
            System.out.println("吃苹果");
        });

        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("吃鸭梨");
            }
        });
    }


    // 参数是接口 lambda表达式只针对 函数式接口：有且仅有一个抽象方法的接口
    private static void useEatable(Eatable e) {
        e.eat();
    }
}
