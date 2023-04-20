package com.hainiu.charstream;

import java.io.FileReader;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("day07\\a.txt");

        // 读取一个字符  如果到达文件末尾 返回-1
        /*int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }*/

        char[] arr = new char[1024];
        int len;
        while ((len = fr.read(arr)) != -1) {
            String s = new String(arr, 0, len);
            System.out.println(s);
        }

        fr.close();

    }
}
