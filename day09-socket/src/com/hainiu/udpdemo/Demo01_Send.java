package com.hainiu.udpdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author HaiNiu
 * @description 用UDP协议发送数据
 */
public class Demo01_Send {
    public static void main(String[] args) throws Exception {
        // 创建发送端Socket对象：随机绑定一个端口号发出数据
        DatagramSocket socket = new DatagramSocket();

        // 数据打包
        /*
        public DatagramPacket(byte buf[], int offset, int length, InetAddress address, int port)
            buf 发送到数据
            offset 发送数据的起始索引
            length 发送数据的长度
            address 发送的目的地
            port 端口号
         */
        String data = "hello Udp 我来了";
        byte[] bytes = data.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1"); // 192.168.62.189
        int port = 10086;
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);

        // 发送
        socket.send(packet);

        // 释放资源
        socket.close();
    }
}
