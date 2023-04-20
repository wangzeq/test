package com.hainiu.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description TCP协议的服务端
 * 读一次数据 给出一次反馈
 */
public class Demo03_Server {
    public static void main(String[] args) throws IOException {

        // 创建服务的Socket对象 启动服务，绑定指定的端口号
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动，绑定端口号" + port);
        // 接收请求 建立连接
        Socket socket = serverSocket.accept();
        System.out.println("建立连接，开始传输数据");

        // 获取输入流读取数据
        InputStream in = socket.getInputStream();

        byte[] bytes = new byte[20];
        int index = 0;
        // 一个字节一个字节
        int b;
        while ((b = in.read()) != -1) {
            bytes[index++] = (byte) b;
        }
        /*for (int i = 0; i < 20; i++) {
            b = in.read();
            bytes[index++] = (byte) b;
        }*/
        // socket.shutdownInput();

        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip + "说：" + new String(bytes));

        // 发送数据 获取输出流
        OutputStream out = socket.getOutputStream();
        // 使用输出流写出数据
        byte[] data = "来吧 老弟".getBytes();
        out.write(data);

        socket.shutdownOutput();

        // 释放资源
        out.close();
        in.close();
        socket.close();
        serverSocket.close();
    }
}
