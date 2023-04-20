package com.hainiu.tcpdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author HaiNiu
 * @description 文件上传服务端
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Socket对象
        ServerSocket serverSocket = new ServerSocket(10086);

        // 线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(0,
                8,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        while (true) {
            // 接收请求建立连接
            Socket socket = serverSocket.accept();
            // 建立一个连接就开启一条线程来传输数据
//            new Thread(new FileUploadThread(socket)).start();
            pool.submit(new FileUploadThread(socket));
        }

//        serverSocket.close();
    }
}
