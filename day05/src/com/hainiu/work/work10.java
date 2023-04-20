package com.hainiu.work;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class work10 {
    public static void main(String[] args) {

        //字符串类型的数字转换为BigDecimal对象
        BigDecimal a = new BigDecimal("1.1");
        System.out.println(a);
        // 实现小数的精确运算
        BigDecimal b = new BigDecimal("0.9");
        System.out.println(b);
        //加法
        BigDecimal c =a.add(b);

        double v = c.doubleValue();
        System.out.println(v);
        //除法
        BigDecimal d =a.divide(b,5, RoundingMode.HALF_UP);
        System.out.println(d);

    }
}
