package com.hainiu.work;
//LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？

import java.util.LinkedList;

public class work2 {

    public static void main(String[] args) {
        //定义链表存储108个数字
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <=108 ; i++) {
            list.add(i);
        }
        System.out.println(list);

        //当剩余大于1时，重复进行操作，扔掉第一张，再拿一张放于最后
        while(list.size()>1){
            list.removeFirst();
            list.addLast(list.removeFirst());
        }
        //读取最后剩余的一张
        Integer num = list.get(0);
        System.out.println(num);

    }
}
