package com.hainiu.filedemo;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {

        // 绝对路径 windows系统下从盘符开始的  linux 系统下从/开始
        // 相对于当前的idea项目而言 从项目的根路径开始的
        File f1 = new File("day07\\a.txt");
        System.out.println(f1);

        File f2 = new File("D:\\javaProjects\\hainiu49_javase\\day07", "a.txt");
        System.out.println(f2);

        File f3 = new File("D:\\javaProjects\\hainiu49_javase\\day07");
        File f4 = new File(f3, "a.txt");
        System.out.println(f4);

        File f5 = new File("day07\\aaa\\bbb\\ccc");
        // 创建文件夹
        System.out.println(f5.mkdirs());

        // 创建文件
        File f6 = new File("day07\\b.txt");
        System.out.println(f6.createNewFile());

        File f7 = new File("day07\\c.txt");
        System.out.println(f7.mkdirs());
//
//        // java中的删除文件api 不走回收站
//
//        File f8 = new File("day07\\b.txt");
//        System.out.println(f8.delete());
//
//        File f9 = new File("day07\\aaa");
//        System.out.println(f9.delete());
//
//        File f10 = new File("C:\\Users\\D\\Desktop\\新建文件夹");
//        // 获取文件夹下面的子内容
//        File[] files = f10.listFiles();
//        for (File file : files) {
//            System.out.println(file);
//        }
//
    }
}
