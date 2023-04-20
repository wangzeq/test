package com.hainiu.oop4;

public class PetTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Bob");
        cat.setColor("橘黄色");

        cat.drink();
        cat.eat();

        Dog dog = new Dog("jerry","棕色");
        dog.drink();
        dog.eat();
    }
}
