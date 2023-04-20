package com.hainiu.oop8;

public class Outer {

    // 静态内部类
    public static class In {
        public void method() {
            System.out.println("In method");
        }

        public static void fun() {
            System.out.println("In fun");
        }
    }


    // 成员内部类
    private class Inner {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    // 使用了内部类
    public void test() {
        Inner inner = new Inner();
        inner.setName("test");
        System.out.println(inner.getName());
    }


    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
