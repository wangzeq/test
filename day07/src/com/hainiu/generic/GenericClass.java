package com.hainiu.generic;
// 泛型类 把泛型加在类上
public class GenericClass<E> {

    // 在类中就把这个泛型当Object来使用

    public void test(E e) {
        System.out.println(e);
    }


}
