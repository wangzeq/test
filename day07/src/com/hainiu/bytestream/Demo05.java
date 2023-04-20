package com.hainiu.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
实现AutoCloseable接口的对象能够成为 try-with-resources 语句的目标
    可以自动关闭
 */

public class Demo05 {
    public static void main(String[] args)  {
        // 将创建流对象的动作放入try的小括号中
        try (FileInputStream fis = new FileInputStream("D:\\阳光海牛\\授课教案\\17 IO流\\mn.jpg");
            FileOutputStream fos = new FileOutputStream("day07-io\\mn.jpg");
        ) {
            // 读写操作仍然在try的大括号中
            // 一次读取一个字节数组 （缓冲区）
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            // catch 异常处理
            e.printStackTrace();
        }
        // 上述代码的流资源会自动关闭
        /*while (true) {

        }*/
    }
}
