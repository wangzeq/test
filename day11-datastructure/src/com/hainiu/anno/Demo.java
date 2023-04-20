package com.hainiu.anno;



import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author HaiNiu
 * @description 解析注解：让虚拟机遇到这个注解时做点事，才会使得注解产生意义。通常是利用反射技术
 */
@ClassPreamble(author = "hainiu", date = "2022-02-02", reviewers = {"Tom", "Jerry"})
public class Demo {

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {

      /*  Date date = new Date();
        System.out.println(date.getYear());*/


        /*TestDemo demo = new TestDemo();
        demo.test1();
        demo.test2();*/

        // 反射技术获取TestDemo字节码对象
        Class<TestDemo> clazz = (Class<TestDemo>) Class.forName("com.hainiu.anno.TestDemo");
        // 创建对象
        TestDemo testDemo = clazz.getDeclaredConstructor().newInstance();

        // 获取类中所有的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            // 判断这个方法身上是否有注解
            if (method.isAnnotationPresent(Test.class)) {
                // 注解的元素值是1
                Test anno = method.getAnnotation(Test.class);
                String value = anno.value();
                if ("1".equals(value)) {
                    method.invoke(testDemo);
                }
            }
        }

    }
}
