package com.hainiu.objectstream;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//         //反序列化
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("day07\\tea."));
//
//        // 对象操作流 到达文件末尾 抛出异常 EOFException  End of file
//
//        while (true) {
//            try {
//                Object obj = in.readObject();
//                System.out.println(obj);
//            } catch (EOFException e) {
//                e.printStackTrace();
//                // 捕获文件末尾的异常 跳出循环
//                break;
//            }
//        }
//
//        in.close();
    }

    private static void write() throws IOException {
        // 序列化多个对象 3个
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("day07\\tea"));

        out.writeObject(new Teacher("Tom", 20, 5000));
        out.writeObject(new Teacher("Jerry", 19, 4000));
        out.writeObject(new Teacher("Jack", 21, 6666));

        out.close();
    }
}
