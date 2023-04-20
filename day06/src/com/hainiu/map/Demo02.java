package com.hainiu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {

        // 通过键找值
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("许仙", "白娘子");
        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("范喜良", "孟姜女");

        // 获取所有的键
        Set<String> keySet = map.keySet();
        // 获取每一个键
        for (String key : keySet) {
            // 通过键获取值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("----------------");

        // Map集合存储的是键值对映射  Map.Entry<k,v>
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 获取每一个键值对
        for (Map.Entry<String, String> entry : entries) {
            // 通过键值对 获取键 获取值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("----------------");
        // 通过Map集合的forEach方法方法遍历
        map.forEach((k, v) -> System.out.println(k + "=" + v));

    }
}
