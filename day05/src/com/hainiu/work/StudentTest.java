package com.hainiu.work;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 20);
        Student s2 = new Student("Tom", 20);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1);
        System.out.println(s1.toString());
    }
}
