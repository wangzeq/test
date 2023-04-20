package com.hainiu.api2;

public class Demo07 {
    public static void main(String[] args) {

        //String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
        /*
            查找并截取
            hellojavaworldjavabigdatajavajava

            worldjavabigdatajavajava

            bigdatajavajava

            java

            ""

            方式2：改变查询的位置而不截取字符串

         */


        String str = "javajavajavahellojavaworldjavajavabigdatajavajava";
        String target = "java";
        int count = search(str, target);
        System.out.println(count);

    }

    public static int search(String str, String target) {
        // 计数器
        int count = 0;
        // 循环查找
        int index;
        while ((index = str.indexOf(target)) != -1) { // 查找 赋值 比较
            // 找到了
            count++;
            // 截取掉查找的部分
            str = str.substring(index + target.length());
        }
        return count;
    }
}
