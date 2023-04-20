package com.hainiu.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        //将创建流对象的动作放入try的小括号中
        try (FileInputStream fis = new FileInputStream("E:\\海牛\\class\\17 IO流\\mn.jpg");
             FileOutputStream fog = new FileOutputStream("day06\\mn.jpg");
        ){
            //读写操作仍然在try的大括号中
            //一次读取一个字节数组(缓冲区)
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer))!= -1) {
                fog.write(buffer, 0, len);
            }
        }catch (IOException e) {
            //catch 异常处理
            e.printStackTrace();
        }
    }
}
