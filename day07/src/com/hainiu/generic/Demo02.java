package com.hainiu.generic;

public class Demo02 {
    public static void main(String[] args) {

        // 使用泛型类时 创建对象时明确数据类型
        GenericClass<String> gc = new GenericClass<>();
        gc.test("Generic");


        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.test(100);


        GenericInterImple<String> i = new GenericInterImple<>();
        i.show("java");

        // 调用方法时明确数据类型
        hello("hello");
        hello(100);




    }

    // 泛型单独的加在方法身上  在返回值前面声明泛型
    public static <Q> void hello(Q q) {
        System.out.println(q);
    }
}
