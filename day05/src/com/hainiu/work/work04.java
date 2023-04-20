package com.hainiu.work;

public class work04 {
    public static void main(String[] args) {
        //定义字符串
        String str = "javajavajavahellojavaworldjavajavabigdatajavajava";
        String target = "java";

        int count = search(str, target);
        System.out.println(count);
    }

    public static int search(String str, String target){
        //设置计数器
        int count = 0;
        //定义索引
        int index = 0;
        //循环查找
        while ((index = str.indexOf(target))!=-1) {
            count++;
            //截取查找到的部分
            str =str.substring(index + target.length());
        }
        return count;

    }


}
