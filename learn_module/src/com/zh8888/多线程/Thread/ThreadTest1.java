package com.zh8888.多线程.Thread;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread Thread = new MyThread();
        Thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程main执行中，i = " + i);

        }
    }
}
