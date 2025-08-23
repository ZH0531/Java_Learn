package com.zh8888.网络编程.TCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable {
    Socket socket;

    ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                try {
                    String s = dis.readUTF();
                    // 在消息前附加上发送者的地址信息
                    String senderAddress = socket.getRemoteSocketAddress().toString();
                    String messageToSend = "来自：" +senderAddress + " 消息: " + s;
                    SendToAllUser(messageToSend);
                    System.out.println(messageToSend);
                    System.out.println("---------------------");
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "下线了");
                    System.out.println("---------------------");
                    SendToAllUser(socket.getRemoteSocketAddress() + "下线了");
                    // 从在线列表中移除断开的客户端
                    Server.OnlineList.remove(socket);
                    socket.close();
                    dis.close();
                    break;

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void SendToAllUser(String message) throws Exception {
        for (Socket socket : Server.OnlineList) {
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            if (!this.socket.equals(socket)) {
                try {
                    dos.writeUTF(message);
                } catch (Exception e) {
                    Server.OnlineList.remove(socket);
                }
            }
        }
    }
}

