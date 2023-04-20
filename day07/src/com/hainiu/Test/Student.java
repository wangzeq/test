package com.hainiu.Test;

public class Student {
        private String name;
        private int age;

        //构造方法
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("");
        }

        public void show() {
            System.out.println(name + "," + age);
        }

}
