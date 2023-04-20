package com.hainiu.work;

import java.io.*;

public class work07 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day07\\bos.txt"));

        Student st = new Student("张三",18,"beijing");

        //将创建的新对象写入oos
        oos.writeObject(st);
        //结果bos文件内非正常输出

        //反序列化还原
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day07\\bos.txt"));

        //获取ois中对象赋给Object中的obj
        Object obj = ois.readObject();

        //强转
        Student ss = (Student) obj;

        System.out.println(ss.getName() + "-" + ss.getAge()+"-" + ss.getAddress());



        oos.close();
        ois.close();


    }
}
