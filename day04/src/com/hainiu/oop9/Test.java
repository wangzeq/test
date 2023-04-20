package com.hainiu.oop9;

public class Test {

    public static void main(String[] args) {

        // 当发现某个方法需要，接口或抽象类的子类对象，我们就可以传递一个匿名内部类过去，来简化传统的代码
        // 只用一次
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳");
            }
        });
    }


    // 参数是接口  传递的一定是接口的实现子类对象
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }

}
