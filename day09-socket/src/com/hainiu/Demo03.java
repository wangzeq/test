package com.hainiu;

import java.io.*;

/**
 * @author HaiNiu
 * @description
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {

        // 字节流 -- 字符流 -- 缓冲区的字符流
       // BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("")));

        // 转换流 都是在构造器中接收字节流 将字节流转换为字符流

        // 字节流指向文件
        FileInputStream fis  = new FileInputStream("C:\\Users\\D\\Desktop\\a.txt");
        // 将字节流转换为字符流
        InputStreamReader in = new InputStreamReader(fis, "gbk");
        for (int i = 0; i < 5; i++) {
            int ch = in.read();
            System.out.println((char) ch);
        }

    }
}
