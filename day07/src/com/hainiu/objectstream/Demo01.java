package com.hainiu.objectstream;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化

       // NotSerializableException
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day07\\obj.txt"));

        // 写出对象
        Student s = new Student("Tom", 20);

        oos.writeObject(s);

        // 释放
        oos.close();

        // 反序列化 将对象从文件中读取出来 重组
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day07\\obj.txt"));
        Student obj = (Student) ois.readObject();
        System.out.println(obj);
        ois.close();

    }
}
