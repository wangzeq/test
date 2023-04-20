package com.hainiu.anno;

// 定义一个注解
public @interface ClassPreamble {

    // 属性
    String author();
    String date();
    int version() default 1;
    String[] reviewers() default {};

}
