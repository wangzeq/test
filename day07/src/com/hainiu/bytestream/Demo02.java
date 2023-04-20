package com.hainiu.bytestream;


import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {

        // 创建输入流指向文件
        FileInputStream fis = new FileInputStream("day07\\a.txt");

//        // 读取数据
//        int by; // 读到的字节值
//        while ((by = fis.read()) != -1) { // 读取一个字节 赋值给by 与-1比较
//            System.out.println((char) by);
//        }

        // 一次读取一个字节数组的数据（缓冲区） 建议大小1024的整数倍
//        byte[] bytes = new byte[8192];
//        int len = fis.read(bytes); // 返回值表示读取到的有效字节个数
//        System.out.println(len);
//
//        // 字节数组转换为字符串
//        String str = new String(bytes, 0, len);
//        System.out.println(str);

        int len; // 有效字节个数
        byte[] bytes = new byte[8192];
        while ((len = fis.read(bytes)) != -1) {
            String s = new String(bytes, 0, len);
            System.out.print(s);
        }

        // 释放资源
        fis.close();

    }
}
