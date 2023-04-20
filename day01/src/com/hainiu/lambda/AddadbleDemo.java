package com.hainiu.lambda;

public class AddadbleDemo {
    public static void main(String[] args) {
        useAddable((int a,int b)->
             a+b
        );

//        useAddable(new Addable(){
//
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        });

    }

    private static void useAddable(Addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
