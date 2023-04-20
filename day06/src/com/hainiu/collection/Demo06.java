package com.hainiu.collection;

import java.util.LinkedList;


/*
栈数据结构的集合
    Stack

    校验括号的正确嵌套 (..)..[.().]..{.[{}].}.(())...

 */
public class Demo06 {
    public static void main(String[] args) {

        // 108 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
        // 头尾操作元素
        // 定义一个链表存储108个元素
        LinkedList<Integer> list= new LinkedList<>();
        for (int i = 1; i <= 108; i++) {
            list.add(i);
        }
        System.out.println(list);

        // 不断删除第一个元素 删除第一个元素添加到最后 ，直到集合长度为1
        while (list.size() > 1) {
            list.removeFirst();
            list.addLast(list.removeFirst());
        }

        // 幸存者
        Integer num = list.get(0);
        System.out.println(num);
    }
}
