package com.hainiu.reflect;

/**
 * @author HaiNiu
 * @description 三种方式分别针对类的不同阶段  源码阶段 编译 运行
 */
public class Demo01_Class {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class类的静态方法 public static Class<?> forName(String className)
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student"); // 全限定类名
        System.out.println(clazz);

        // 任意类型的class属性
        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);

        System.out.println(clazz == clazz2);

        // Obejct类中定义的方法：public final Class<?> getClass()
        Student s = new Student();
        Class<Student> clazz3 = (Class<Student>) s.getClass();
        System.out.println(clazz3);
        System.out.println(clazz == clazz3);
    }
}
