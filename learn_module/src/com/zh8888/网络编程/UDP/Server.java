package com.zh8888.网络编程.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket(6666);

        System.out.println("服务端已启动!");
        System.out.println("---------------------");


        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        while (true) {
            socket.receive(packet);
            int length = packet.getLength();
            String str = new String(bytes, 0, length);

            System.out.print("接受成功！来自：");
            System.out.println(packet.getAddress().getHostAddress() + ":" + packet.getPort());
            System.out.println("内容：" + str);
            System.out.println("---------------------");
        }
    }
}
