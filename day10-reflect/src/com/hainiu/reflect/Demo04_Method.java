package com.hainiu.reflect;

import java.lang.reflect.Method;

/**
 * @author HaiNiu
 * @description
 */
public class Demo04_Method {
    public static void main(String[] args) throws Exception {

        // 获取类的字节码对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student");
        // 获取空参构造 创建对象
        Student student = clazz.getDeclaredConstructor().newInstance();

        // public void study(String subject)
        // 获取成员方法
        Method method = clazz.getMethod("study", String.class);
//        Object re = method.invoke(student, "java");
//        System.out.println(re);

        method.setAccessible(true);
        // 执行方法
        method.invoke(student, "java");

        System.out.println("-----");

        Method setAgeMethod = clazz.getMethod("setAge", int.class);
        setAgeMethod.invoke(student, 20);

        Method getAgeMethod = clazz.getMethod("getAge");
        Object age = getAgeMethod.invoke(student);
        System.out.println(age);

    }
}
