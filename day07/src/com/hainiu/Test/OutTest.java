package com.hainiu.Test;

public class OutTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
//        Outer o = new Outer();
//        o.method();
    }
}
