package com.hainiu.work2;

public class DumbPhone extends Phone {
    @Override
    public void call(String name) {
        System.out.println("给" + name + "打电话");
    }
    public void help(){
        System.out.println("老年机可以求救");
    }

}
