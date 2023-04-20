package com.hainiu.udpdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author HaiNiu
 * @description UDP协议的接收数据
 */
public class Demo02_Server {
    public static void main(String[] args) throws Exception {
        // 创建接收端Socket对象  绑定某个指定的端口号启动
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);

        // 打包接收
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        while (true) {
            // 接收
            socket.receive(packet); // 阻塞式的

            // 解析包裹
            int len = packet.getLength(); // 有效数据的长度
            // 转换字符串
            String s = new String(bytes, 0, len);
            String ip = packet.getAddress().getHostAddress();
            System.out.println(ip + "说：" + s);
        }

        // 释放资源
//        socket.close();
    }
}
