package com.hainiu.reflect;

import java.lang.reflect.Field;

/**
 * @author HaiNiu
 * @description 获取类中的成员变量
 */
public class Demo03_Field {
    public static void main(String[] args) throws Exception {

        // 获取类的字节码对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student");
        // 获取空参构造 创建对象
        Student student = clazz.getDeclaredConstructor().newInstance();

        // 获取成员
        Field nameField = clazz.getDeclaredField("name");
        /*
        Field类提供的API：
            public Object get(Object obj)
                返回指定对象上由此Field表示的字段的值。

            public void set(Object obj, Object value)
                将指定的对象参数上由此Field对象表示的字段设置为指定的新值。
         */
        // 设置可访问
        nameField.setAccessible(true);
        // 赋值
        nameField.set(student, "tom"); // 成员变量对象调用方法  为obj对象的该成员变量赋值为value
        // 获取值
        Object value = nameField.get(student);
        System.out.println(value);

        System.out.println("--------");

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(student, 23);
        Object v2 = ageField.get(student);
        System.out.println(v2);

        System.out.println("--------");
        System.out.println(student);

    }
}
