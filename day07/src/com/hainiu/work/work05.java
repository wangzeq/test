package com.hainiu.work;

import java.util.Properties;

public class work05 {
    public static void main(String[] args) {

        Properties properties = new Properties();
        //添加元素
        properties.setProperty("name", "Tom");
        properties.setProperty("age", "20");
        properties.setProperty("address", "beijing");

//        String name = properties.getProperty("name");
//        System.out.println(name);

        //遍历
        properties.forEach((k,v)-> System.out.println(k+"="+v));
    }
}
