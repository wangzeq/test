package com.hainiu.oop2;

// 继承自Fu
public class Zi extends Fu {


    // 构造方法 不存在继承的概念，但是子类的构造方法必须去访问父类的构造方法
    public Zi () {
        super();
        System.out.println("子类构造方法执行");
    }

    int num = 20;

    public void method() {
        System.out.println("Zi method");
        int num = 30;
        System.out.println(num); // 30
        System.out.println(this.num); // 成员的
        System.out.println(super.num); // 父类的 super
    }

    // 重写 之后 子类对象调用方法 执行自己重写的内容
    @Override // 校验下面的方法是不是重写父类的
    public void show() {
        System.out.println("Zi show");
    }

}
