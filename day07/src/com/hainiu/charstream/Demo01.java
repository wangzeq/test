package com.hainiu.charstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        // 创建输入流
        FileInputStream fis = new FileInputStream("day07\\a.txt");

        // 由于某些字符 占用多个字节 读取一个字节出现了乱码现象
        // 按照编码表  占几个字节就读取几个保证读取到一个完整的字符

        // 要查看纯文本文件中的字符 -- 用记事本打开不乱码的文件
        for (int i = 0; i < 4; i++) {
            int by = fis.read();
            System.out.println((char) by);
        }

        fis.close();


    }

}
