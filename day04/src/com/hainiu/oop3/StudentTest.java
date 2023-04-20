package com.hainiu.oop3;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println(Student.school);

        Student s1 = new Student();

        System.out.println(s1.school);
        s1.school = "海牛大学";

        Student s2 = new Student();

        System.out.println(s2.school);

    }
}
