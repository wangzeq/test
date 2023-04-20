package com.hainiu.tcpdemo;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author HaiNiu
 * @description
 */
public class FileUploadThread implements Runnable {

    private Socket socket;

    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        // 传输数据
        FileOutputStream out = null;
        try {
            // 从网络中读取到本地
            InputStream in = socket.getInputStream();
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            out = new FileOutputStream("day09-socket\\upload\\" + name + ".jpg");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
            // 文件上传完毕，给出反馈
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("文件上传成功");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
