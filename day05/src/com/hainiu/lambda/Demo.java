package com.hainiu.lambda;

/*
(形式参数) -> {代码块}
(形式参数) -- 要重写的方法的形式参数，如果没有小括号空着
->
{代码块} -- 要重写的方法的方法体


 */
public class Demo {


    public static void main(String[] args) {
        /*goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们去游泳吧");
            }
        });*/

        // 只需关注在大括号中如何重写方法即可
        goSwimming(() -> {
            System.out.println("我们去狗刨吧");
        });

    }

    // 使用接口作为参数的场景
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }

}
