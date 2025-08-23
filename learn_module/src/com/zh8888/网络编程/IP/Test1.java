package com.zh8888.网络编程.IP;

import java.net.InetAddress;

public class Test1 {
    public static void main(String[] args) throws Exception {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip2.isReachable(3000));

    }
}
