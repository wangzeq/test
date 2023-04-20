package com.hainiu.api2;

public class Demo06 {
    public static void main(String[] args) {
        /*
        public int indexOf(String str)
            返回指定的子字符串在调用方法的字符串中第一次出现的索引。如果没有，返回-1
        public int indexOf(String str, int fromIndex)
            返回指定的子字符串在调用方法的字符串中第一次出现的索引，以指定的索引开始搜索。如果没有，返回-1
         */
        String str = "hellojavaworldjavabigdatajava";
        String subStr = "java";
        int i = str.indexOf(subStr, 6);
        System.out.println(i);

        // 截取返回的是新串  接收
        String s = str.substring(5);
        System.out.println(s);

    }
}
