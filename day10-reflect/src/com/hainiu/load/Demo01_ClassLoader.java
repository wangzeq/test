package com.hainiu.load;

/**
 * @author HaiNiu
 * @description 类加载器
 *
 * Bootstrap class loader（引导类加载器，通常为null）
 *
 * Platform class loader（平台类加载器，JDK8 扩展类加载器，ExtClassLoader）
 *
 * System class loader（系统类加载器，也称应用类加载器，AppClassLoader）
 *
 * 加载系统资源
 *
 */
public class Demo01_ClassLoader {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader(); // AppClassLoader
        System.out.println(systemClassLoader);

        ClassLoader classLoader = systemClassLoader.getParent(); // ExtClassLoader
        System.out.println(classLoader);

        ClassLoader loader = classLoader.getParent();
        System.out.println(loader);

    }
}
