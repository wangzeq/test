package com.hainiu.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        // 字节流写出数据

        // 创建输出流指向文件  FileOutputStream(String name)
        // 如果文件不存在，那么会自动创建；保证目录存在
        // 如果文件存在，那么清空数据，从头再写  （覆盖写入）

//        FileOutputStream fos = new FileOutputStream("day07\\a.txt");

        //  // 想追加 FileOutputStream(String name, boolean append)
        FileOutputStream fos = new FileOutputStream("day07\\a.txt", true);


        // 写数据
        fos.write(97); // 写一个字节
        fos.write(new byte[]{97, 98, 99}); // 写一个字节数组
        fos.write(new byte[]{97, 98, 99}, 0, 2); // 写一个字节数组的一部分

        fos.write("\r\n".getBytes());
        fos.write(97);

        // 释放资源 关流
        fos.close();

    }
}
