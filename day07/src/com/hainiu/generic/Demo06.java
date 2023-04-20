package com.hainiu.generic;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo06 {
    public static void main(String[] args) {

        // map集合 键是Zi类型
        /*TreeMap<Zi, String> map = new TreeMap<>(new Comparator<Zi>() {
            @Override
            public int compare(Zi o1, Zi o2) {
                return 1;
            }
        });*/

        // public TreeMap(Comparator<? super K> comparator)
        // 对Zi及其父类型 排序  那么Zi就可以存入集合了。
        TreeMap<Zi, String> map = new TreeMap<>(new Comparator<Fu>() {

            @Override
            public int compare(Fu o1, Fu o2) {
                return 1;
            }
        });

        map.put(new Zi(), "hello");
        map.put(new Zi(), "world");
        map.put(new Zi(), "java");

        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
