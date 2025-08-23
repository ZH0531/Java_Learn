package com.zh8888.多线程.Runnable;

public class RunnableTest1 {
    public static void main(String[] args) {
//        Runnable runnable = () -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println("子线程MyRunnable执行中，i = " + i);
//
//            }
//
//        };
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("子线程Runnable执行中，i = " + i);
            }
        }).start();


        for (int i = 0; i < 100; i++) {
            System.out.println("主线程main执行中，i = " + i);

        }
    }
}
