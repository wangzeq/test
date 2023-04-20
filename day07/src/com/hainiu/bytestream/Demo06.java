package com.hainiu.bytestream;

import java.io.*;

public class Demo06 {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // 带缓冲区的流不能直接指向文件 需要 包装基本的流

        // 创建输入流指向源文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\阳光海牛\\授课教案\\17 IO流\\mn.jpg"));

        // 创建输出流指向目标文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day07-io\\mn.jpg"));

        /*int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }*/

        byte[] buffer = new byte[8192];
        int len;
        while ((len = bis.read(buffer)) != -1) {
            // 写到目的地  写出有效部分
            bos.write(buffer, 0, len);
        }

        // 释放资源
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
