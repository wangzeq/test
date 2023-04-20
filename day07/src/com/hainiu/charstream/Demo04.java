package com.hainiu.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {

        // 字符流拷贝  错误示例
        FileReader fr = new FileReader("E:\\海牛\\class\\17 IO流\\mn.jpg");
        FileWriter fw = new FileWriter("day07\\aaa.jpg");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}
