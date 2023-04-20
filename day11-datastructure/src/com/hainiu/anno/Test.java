package com.hainiu.anno;

import java.lang.annotation.*;

// 标注在方法身上 哪个方法使用了该注解 该方法就能执行
@Retention(RetentionPolicy.RUNTIME) // 声明周期
@Target(ElementType.METHOD) // 标注位置
public @interface Test {

    // 元素给解析注解的程序使用的
    String value() default "";

}
