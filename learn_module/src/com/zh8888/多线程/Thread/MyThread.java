package com.zh8888.多线程.Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程MyThread执行中，i = " + i);

        }
    }


}
