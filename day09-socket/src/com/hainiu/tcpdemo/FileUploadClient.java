package com.hainiu.tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author HaiNiu
 * @description 文件上传客户端
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建输入流 指向文件数据源
        FileInputStream in = new FileInputStream("C:\\Users\\D\\Pictures\\Camera Roll\\aa.jpg");

        // Socket对象
        Socket socket = new Socket(InetAddress.getByName("localhost"), 10086);

        // 传输数据  从文件中流向网络
        OutputStream out = socket.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0 , len);
            // 这行代码勿动 二期优化使用
//            Thread.sleep(50);
        }
        // 数据传输完毕 给服务端一个结束标记
        socket.shutdownOutput();

        // 读取服务端的反馈
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);

        // 释放资源
        in.close();
        socket.close();
    }
}
