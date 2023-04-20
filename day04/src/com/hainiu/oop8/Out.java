package com.hainiu.oop8;

public class Out {

    public void test() {
        class In {
            public void hello() {
                System.out.println("hello in");
            }
        }
        // 方法中使用
        In in = new In();
        in.hello();
    }

}
