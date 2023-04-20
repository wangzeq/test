package com.hainiu.work;

public class PetTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setColor("黑色");
        dog.setName("黑球");
        //调用方法
        dog.drink();
        dog.eat();

        Cat cat = new Cat();
        cat.setColor("白色");
        cat.setName("小白");

        cat.drink();
        cat.eat();
    }
}
