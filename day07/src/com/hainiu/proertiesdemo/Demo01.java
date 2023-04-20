package com.hainiu.proertiesdemo;

import java.util.Enumeration;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) {

//        Properties类表示一组持久的属性。
//        Properties可以保存到流中或从流中加载。
//        属性列表中的每个键及其对应的值都是一个字符串。
        Properties properties = new Properties();

        // 添加元素的方法
        properties.setProperty("name", "tom");
        properties.setProperty("address", "beijing");
        properties.setProperty("age", "23");

        // 获取
        /*String name = properties.getProperty("name");
        System.out.println(name);*/

        // 遍历
        properties.forEach((k, v) -> System.out.println(k + "=" + v));

        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String key = (String) propertyNames.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
