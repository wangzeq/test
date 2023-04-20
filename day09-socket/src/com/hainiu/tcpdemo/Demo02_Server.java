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
public class Demo02_Server {
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
        byte[] bytes = new byte[1024];
        int len = in.read(bytes); // 读取到的有效长度
        String s = new String(bytes, 0, len);
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip + "说：" + s);

        // 发送数据 获取输出流
        OutputStream out = socket.getOutputStream();
        // 使用输出流写出数据
        byte[] data = "来吧 老弟".getBytes();
        out.write(data);

        // 释放资源
        in.close();
        socket.close();
        serverSocket.close();
    }
}
