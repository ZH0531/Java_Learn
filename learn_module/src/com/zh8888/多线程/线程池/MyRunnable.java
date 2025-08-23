package com.zh8888.多线程.线程池;

public class MyRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行中...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
