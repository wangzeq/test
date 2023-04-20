package com.hainiu;

import java.util.UUID;

/**
 * @author HaiNiu
 * @description
 */
public class Demo02 {
    public static void main(String[] args) {

        // uuid  id作为一条数据的唯一标识

        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid);

    }
}
