package com.hainiu.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 注意：流只能指向文件 不能指向目录 报出拒绝访问错误

        // 创建输入流指向源文件
        FileInputStream fis = new FileInputStream("E:\\海牛\\class\\17 IO流\\mn.jpg");

        // 创建输出流指向目标文件
        FileOutputStream fos = new FileOutputStream("day07\\mn.jpg");

        // 读写操作
        // 一次读一个字节
        /*int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }*/

        // 一次读取一个字节数组 （缓冲区）
        byte[] buffer = new byte[8192];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            // 写到目的地  写出有效部分
            fos.write(buffer, 0, len);
        }

        // 释放资源
        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // 占用这个文件
        /*while (true) {

        }*/

    }
}
