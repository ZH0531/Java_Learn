package com.zh8888.网络编程.TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    public static List<Socket> OnlineList = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        try (ServerSocket ss = new ServerSocket(6666)) {
            System.out.println("服务端已启动!");
            System.out.println("---------------------");
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(32, 32, 0, TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(6), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

            while (true) {
                Socket socket = ss.accept();
                OnlineList.add(socket);
                ServerReaderRunnable srt = new ServerReaderRunnable(socket); //创建线程
                threadPoolExecutor.execute(srt);
                System.out.println(socket.getRemoteSocketAddress() + "上线了");
                System.out.println("---------------------");
            }
        }

    }
}
