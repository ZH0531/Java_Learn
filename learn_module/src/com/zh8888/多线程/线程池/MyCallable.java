package com.zh8888.多线程.线程池;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int a;
    public MyCallable(int a) {
        this.a = a;
    }


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+"运行中...");
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum+=i;
        }
        Thread.sleep(1000);

        return Thread.currentThread().getName()+"输出1-"+a+"和为"+sum;
    }
}
