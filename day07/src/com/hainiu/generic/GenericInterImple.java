package com.hainiu.generic;

// 子类继续使用泛型
public class GenericInterImple<ET> implements GenericInter<ET> {
    @Override
    public void show(ET et) {
        System.out.println(et);
    }
}
