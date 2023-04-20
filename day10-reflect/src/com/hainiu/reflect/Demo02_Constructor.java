package com.hainiu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author HaiNiu
 * @description 获取类中的构造器
 * Constructor[] getConstructors()
 * 	获取此 Class 对象所表示的类的所有公共构造方法。
 * Constructor[] getDeclaredConstructors()
 * 	获取此 Class 对象表示的类声明的所有构造方法（包含私有）。
 *
 * Constructor<T> getConstructor(Class... parameterTypes)
 * 	获取此 Class 对象所表示的类的指定公共构造方法。
 * Constructor getDeclaredConstructor(Class... parameterTypes)
 * 	获取此 Class 对象所表示的类的指定构造方法（包括私有和默认修饰）。
 * 	参数：构造方法是什么参数，按顺序写这些参数的class对象即可  例如：String.class
 */
public class Demo02_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取类的字节码对象
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.reflect.Student");

        // 通过字节码对象获取构造器
        Constructor<Student>[] constructors = (Constructor<Student>[]) clazz.getConstructors();
        for (Constructor<Student> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------");
        Constructor<Student>[] declaredConstructors = (Constructor<Student>[]) clazz.getDeclaredConstructors();
        for (Constructor<Student> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("---------------");

        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        System.out.println("---------------");

        Constructor<Student> constructor2 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor2);

        System.out.println("---------------");
        // 使用公共构造创建对象
        Student student = constructor.newInstance("Tom", 23);
        System.out.println(student);

        // 使用私有构造创建对象
        constructor2.setAccessible(true); // 参数为true 设置可访问  取消java访问权限检查  暴力反射
        Student student2 = constructor2.newInstance("Jerry");
        System.out.println(student2);
    }
}
