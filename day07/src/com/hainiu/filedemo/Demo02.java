package com.hainiu.filedemo;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        // 获取C:\Users\D\Desktop\新建文件夹 下面的所有md后缀的文档

        // 表示路径
        File file = new File("C:/Users/D/Desktop/新建文件夹");

        // 获取子内容  只能用目录来调用
        File[] files = file.listFiles();
        // 非空判断  如果操作的文件夹没有权限 那么返回的是null
        if (files != null) {
            for (File f : files) {
                // md后缀的文档
                if (f.isFile() && f.getName().endsWith(".md")) {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
