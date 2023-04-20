package com.hainiu.tcpdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description TCP协议的服务端
 *
 */
public class Demo04_Server {
    public static void main(String[] args) throws IOException {

        // 创建服务的Socket对象 启动服务，绑定指定的端口号
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动，绑定端口号" + port);
        // 接收请求 建立连接
        Socket socket = serverSocket.accept();
        System.out.println("建立连接，开始传输数据");

        // 获取连接中的字节流输出包装成字符流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 获取连接中的字节流输入包装成字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            String revLine = new StringBuilder(line).reverse().toString();
            writer.write(revLine);
            writer.newLine();
            writer.flush();
        }
        // 服务端 不释放
    }
}
