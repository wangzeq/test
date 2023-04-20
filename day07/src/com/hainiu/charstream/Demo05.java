package com.hainiu.charstream;

import java.io.*;

public class Demo05 {
    public static void main(String[] args) throws IOException {

        // 创建缓冲字符输入流
        BufferedReader br = new BufferedReader(new FileReader("day07\\a.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter("day07\\a.txt"));
//        bw.write("hello");
//        bw.newLine();
//        bw.write("IO流");
//        bw.newLine();
//        bw.close();
    }
}
