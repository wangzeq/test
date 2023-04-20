package com.hainiu.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args)  {

        // 捕获异常处理
        // 有些动作不管出现异常与否 都需要执行  例如释放资源
        // finally语句

        // 把开流和读写操作 放入try语句中，将释放资源的操作放到finally语句

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 创建输入流指向源文件
            fis = new FileInputStream("E:\\海牛\\class\\17 IO流\\mn.jpg");

            // 创建输出流指向目标文件
            fos = new FileOutputStream("day07\\mn.jpg");

            // 一次读取一个字节数组 （缓冲区）
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 只要虚拟机不退出 就执行
            // 释放资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
