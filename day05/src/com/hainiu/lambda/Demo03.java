package com.hainiu.lambda;

public class Demo03 {

    public static void main(String[] args) {

        useAddable((x, y) -> x + y);

    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
