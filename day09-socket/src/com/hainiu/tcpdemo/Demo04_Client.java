package com.hainiu.tcpdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description TCP协议的客户端
 * 客户端数据来源键盘录入，发送到服务端，在服务端将数据反转，发回客户端。
 */
public class Demo04_Client {

    public static void main(String[] args) throws IOException {

        // 创建发送端Socket对象，参数：需要连接的ip  端口号
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 12345;
        Socket socket = new Socket(ip, port);

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        // 获取连接中的字节流输出包装成字符流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 获取连接中的字节流输入包装成字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while (true) {
            System.out.println("请输入文本，服务器会将文本反转写会回：");
            String line = sc.nextLine();
            // 发送到服务端
            if ("over".equals(line)) {
                break;
            }
            writer.write(line);
            writer.newLine();
            writer.flush();
            // 读一行反馈
            String revLine = reader.readLine();
            System.out.println("服务器反转之后的效果是：");
            System.out.println(revLine);
        }
        // 禁用输出流
        socket.shutdownOutput();
        // 释放
        socket.close();
    }

}
