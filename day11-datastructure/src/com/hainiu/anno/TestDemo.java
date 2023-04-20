package com.hainiu.anno;

/**
 * @author HaiNiu
 * @description 使用注解
 */
public class TestDemo {

    public void test1() {
        System.out.println("111111");
    }

    @Test
    public void test2() {
        System.out.println("22222");
    }

    @Test("1")
    public void test3() {
        System.out.println("33333");
    }

    @Test("2")
    public void test4() {
        System.out.println("44444");
    }

}
