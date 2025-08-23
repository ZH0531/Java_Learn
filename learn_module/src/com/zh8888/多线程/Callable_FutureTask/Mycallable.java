package com.zh8888.多线程.Callable_FutureTask;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String> {
    private int n;

    Mycallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("子线程" + Thread.currentThread().getName() + "执行中");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "1-" + n + "的和是：" + sum;
    }
}
