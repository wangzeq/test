package com.hainiu;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01 {


    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.62.189");

        System.out.println(address);

        InetAddress address1 = InetAddress.getByName("SuperHan");
        System.out.println(address1);

        // ip
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);

        // 主机名
        String hostName = address.getHostName();
        System.out.println(hostName);

    }

}
