package com.hainiu.generic;

import java.util.ArrayList;

public class Demo04 {

    public static void main(String[] args) {
        ArrayList<Father> list1 = new ArrayList<>();
        testBounds(list1);

        ArrayList<Son> list2 = new ArrayList<>();
        testBounds(list2);

        ArrayList<Daughter> list3 = new ArrayList<>();
        testBounds(list3);

        /*ArrayList<Mother> list4 = new ArrayList<>();
        testBounds(list4);*/

       /* ArrayList<Granddad> list5 = new ArrayList<>();
        testBounds(list5);*/
    }

    // 泛型方法
    public static <T> void testBounds(ArrayList<? extends Father> list) {

    }

}


class Granddad {}

class Father extends Granddad {}

class Son extends Father {}

class Daughter extends Father {}

class Mother {}
