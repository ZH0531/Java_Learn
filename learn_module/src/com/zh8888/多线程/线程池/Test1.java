package com.zh8888.多线程.线程池;

import java.util.Scanner;
import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) {
//        int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Runnable runnable = new MyRunnable();
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);


//        Callable<String> callable = new MyCallable(100);
        Future<String> future = threadPoolExecutor.submit(new MyCallable(100));
        Future<String> future1 = threadPoolExecutor.submit(new MyCallable(200));
        Future<String> future2 = threadPoolExecutor.submit(new MyCallable(300));
        try {
            System.out.println(future.get());
            System.out.println(future1.get());
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

//        threadPoolExecutor.shutdown();
//        threadPoolExecutor.shutdownNow();
    }
}
