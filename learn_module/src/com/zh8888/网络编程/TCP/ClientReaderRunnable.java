package com.zh8888.网络编程.TCP;


import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientReaderRunnable implements Runnable {
    Socket socket;

    ClientReaderRunnable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                try {
                    String s = dis.readUTF();
                    System.out.println(s);
                    System.out.println("---------------------");
                } catch (IOException e) {
                    socket.close();
                    dis.close();
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
