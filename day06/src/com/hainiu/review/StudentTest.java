package com.hainiu.review;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Tom");

        try {
            s.setAge(22);
        } catch (AgeOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println(s);
    }
}
