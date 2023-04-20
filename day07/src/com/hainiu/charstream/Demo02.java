package com.hainiu.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {

        // 写出字符
        FileWriter fw = new FileWriter("day07\\a.txt", true);

        // 写
        fw.write("hello");
        fw.write("world");
        fw.write("你好");

        fw.close();


    }
}
