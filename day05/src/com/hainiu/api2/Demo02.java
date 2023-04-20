package com.hainiu.api2;


public class Demo02 {
    public static void main(String[] args) {
        // public String(byte[] bytes)
        byte[] bytes = {97, 98, 99, 100, 101};

        String s = new String(bytes); // abcde
        System.out.println(s);

        // public String(char[] value)
        char[] value = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        String s1 = new String(value);
        System.out.println(s1);
    }
}
