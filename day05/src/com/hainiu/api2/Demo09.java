package com.hainiu.api2;

import java.util.Random;
import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        // 生成验证码  四位的字符串  大写字母小写字母数字
        // 通过索引操作数据
        // 校验验证码

        // 验证失败 验证码刷新

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("系统生成的验证码为：");
            String code = code();
            System.out.println(code);

            System.out.println("请输入验证码：");
            String str = sc.nextLine();
            if (code.equalsIgnoreCase(str)) {
                System.out.println("验证通过");
                break;
            } else {
                System.out.println("验证失败，验证码刷新");
            }
        }

    }

    public static String code() {
        // 将所有可用的字符存储起来 String
        String str = "";
        for (char i = 'a'; i <= 'z'; i++) {
            str += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            str += i;
        }
        for (char i = '0'; i <= '9'; i++) {
            str += i;
        }

        // 循环4次 随机获取一个索引  通过索引获取元素
        String code = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            code += c;
        }
        return code;
    }
}
