package com.hainiu.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description TCP协议的客户端
 * 写一次数据 读一次反馈
 */
public class Demo02_Client {

    public static void main(String[] args) throws IOException {

        // 创建发送端Socket对象，参数：需要连接的ip  端口号
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 12345;
        Socket socket = new Socket(ip, port);

        // 发送数据 获取输出流
        OutputStream out = socket.getOutputStream();
        // 使用输出流写出数据
        byte[] bytes = "hello tcp 我来了".getBytes();
        out.write(bytes);

        // 获取输入流读 服务端的反馈
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        String s = new String(data, 0, len);
        System.out.println(s);

        // 释放资源
        out.close();
        socket.close();
    }

}
