package com.zh8888.多线程.Callable_FutureTask;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Callable<String> callable = new Mycallable(100);
        FutureTask<String> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);

        Callable<String> callable1 = new Mycallable(100);
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        Thread thread1 = new Thread(futureTask1);

        thread.start();
        thread1.start();
        System.out.println(futureTask.get());
        System.out.println(futureTask1.get());
    }
}
