package com.hainiu.proertiesdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        // Properties可以保存到流中或从流中加载。

        /*// 流指向文件
        FileInputStream fis = new FileInputStream("day07-io\\prop.properties");

        // 集合
        Properties prop = new Properties();
        // 从流中加载到集合中
        prop.load(fis);

        fis.close();

        prop.forEach((k, v) -> System.out.println(k + "=" + v));*/

        // 从集合保存到流中
        Properties prop = new Properties();
        prop.setProperty("username", "root");
        prop.setProperty("password", "123456");
        prop.setProperty("url", "www.hainiu.com");

        // 流
        FileOutputStream out = new FileOutputStream("day07-io\\prop2.properties");
        prop.store(out, "this is mysql resources message");

        out.close();

    }
}
