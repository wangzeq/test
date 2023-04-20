package com.hainiu.map;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        // 添加 修改
        // 如果集合中没有这个键，添加
        System.out.println(map.put("郭靖", "黄蓉"));
        System.out.println(map.put("杨过", "郭襄"));
        System.out.println(map.put("张无忌", "赵敏"));
        // 如果集合中有这个键，则用新的值覆盖旧的值
        System.out.println(map.put("杨过", "小龙女"));

        // 根据键删除键值对
        System.out.println(map.remove("张无忌"));
//
        System.out.println(map.containsKey("张无忌"));
//
        System.out.println(map.size());
//
        System.out.println(map);

    }
}
