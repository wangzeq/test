package com.hainiu.oop6;

public class AnimalTest {


    public static void main(String[] args) {

        /*Cat cat = new Cat();
        useCat(cat);

        Dog dog = new Dog();
        useDog(dog);*/

        Cat cat = new Cat();
        useAnimal(cat);

        Dog dog = new Dog();
        useAnimal(dog);

        Animal a = new Cat();
        a.eat();
        // 向下转型
//        Dog d = (Dog) a; // ClassCastException 类型转换异常

        // instanceof  判断左边的对象是否是右边的类型、子类型、实现类类型
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.play();
        }
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            System.out.println(d);
        }
    }


    // 定义方法时候，使用父类型作为参数，在使用的时候，使用具体的子类型参与操作
    public static void useAnimal(Animal animal) { // 方法的参数是抽象类 将来传递的一定是子类对象
        animal.eat();
    }



    /*public static void useCat(Cat cat) { // Cat cat = new Cat()
        cat.eat();
    }

    public static void useDog(Dog dog) {
        dog.eat();
    }*/


}
