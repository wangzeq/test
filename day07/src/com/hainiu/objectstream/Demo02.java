package com.hainiu.objectstream;

import java.io.*;
import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化
//        write();

        // 反序列化
         read();

    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day07\\obj.txt"));
        Student obj = (Student) ois.readObject();
        System.out.println(obj);
        ois.close();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day07\\obj.txt"));
        Student s = new Student("Tom", 20);
        oos.writeObject(s);
        oos.close();
    }
}
