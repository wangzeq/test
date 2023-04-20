package com.hainiu.work;
//定义一个Worker类（属性 姓名name 年龄age 工资salary）
//    创建几个Worker对象，存入TreeMap集合，要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；如果也相同，按照姓名字典顺序排序。

import java.util.TreeSet;

public class work4 {
    public static void main(String[] args) {

        TreeSet<Worker> wk = new TreeSet<>();

        Worker w1 = new Worker("张三",33,10000);
        Worker w2 = new Worker("李四",34,15000);
        Worker w3 = new Worker("王五",32,16000);
        Worker w4 = new Worker("赵六",32,9000);


       wk.add(w1);
        wk.add(w2);
        wk.add(w3);
        wk.add(w4);

        for (Worker w : wk) {
            System.out.println(w);
        }


    }

}
