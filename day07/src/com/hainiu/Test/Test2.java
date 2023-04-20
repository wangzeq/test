package com.hainiu.Test;

public class Test2 {
    public static void main(String[] args) {
        Student2 stu2 = new Student2();
        stu2.setName("张三");
        stu2.setAge(20);

        stu2.toString();
        stu2.show();


        Student2 stu3 = new Student2("李四",18);
        stu3.show();
    }


}
