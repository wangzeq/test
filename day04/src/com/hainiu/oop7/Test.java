package com.hainiu.oop7;


public class Test {
    public static void main(String[] args) {

        // 创建 DumbPhone 对象测试
        DumbPhone dumbPhone = new DumbPhone();
        dumbPhone.setBrand("诺基亚");
        dumbPhone.setPrice(500);

        dumbPhone.open();
        dumbPhone.call("张三");
        dumbPhone.help();


        System.out.println("-------------");
        // 创建 SmartPhone 对象测试
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setBrand("华为");
        smartPhone.setPrice(5000);

        smartPhone.open();
        smartPhone.call("李四");
        smartPhone.play();



        // 创建 SmartPhone 对象测试



    }
}
