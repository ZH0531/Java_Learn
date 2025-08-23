package com.zh8888.网络编程.TCP;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6666);
        ClientReaderRunnable crr = new ClientReaderRunnable(socket);
        new Thread(crr).start();
        System.out.println("客户端已启动！");
        System.out.println("当前端口："+socket.getLocalPort());
        System.out.println("请直接输入要发送的内容(输入exit退出程序)：");
        System.out.println("---------------------");

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            System.out.println("---------------------");

            if (str.equals("exit")) {
                dos.close();
                socket.close();
                System.out.println("已退出！");
                break;
            }
            dos.writeUTF(str);
            dos.flush();
        }
    }
}
