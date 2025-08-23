package com.zh8888.网络编程.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("客户端已启动");
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();

        while (true) {
            System.out.print("请输入要发送的内容(输入exit退出程序)：");
            String str = sc.nextLine();

            if (str.equals("exit")) {
                socket.close();
                break;
            }

            byte[] bytes = str.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 6666);

            socket.send(packet);

            System.out.println("发送完毕！");
            System.out.println("---------------------");

        }


    }
}
