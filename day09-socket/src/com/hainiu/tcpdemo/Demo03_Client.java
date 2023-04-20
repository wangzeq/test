package com.hainiu.tcpdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description TCP协议的客户端
 * 如果需要实现大量数据的传输 需要给出结束标记
 */
public class Demo03_Client {

    public static void main(String[] args) throws IOException {

        // 创建发送端Socket对象，参数：需要连接的ip  端口号
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 12345;
        Socket socket = new Socket(ip, port);

        // 发送数据 获取输出流
        OutputStream out = socket.getOutputStream();
        // 使用输出流写出数据
        String s = "hello tcp 我来了~";
        // 一个字节
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            out.write(b);
        }
        // 写完了数据，告知服务器结束了
        // 关闭输出流 写出一个结束标记
        socket.shutdownOutput();

        // 获取输入流读 服务端的反馈
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        String s2 = new String(data, 0, len);
        System.out.println(s2);

        // 释放资源
        out.close();
        in.close();
        socket.close();
    }

}
