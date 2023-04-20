package com.hainiu.generic;

// 子类不再使用泛型 将泛型明确为具体的类型
public class GenericInterImpl implements GenericInter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
