package com.hainiu.api2;

public class Demo05 {
    public static void main(String[] args) {

        // 图片上传 jpg png jpeg
        String path = "C:\\Users\\D\\Desktop\\新建文件夹\\wm安装\\centos1.mp4";

        if (path.endsWith(".png") || path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("是图片");
        } else {
            System.out.println("不能上传");
        }



    }
}
