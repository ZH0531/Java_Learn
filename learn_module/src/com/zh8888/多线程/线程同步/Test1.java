package com.zh8888.多线程.线程同步;

public class Test1 {
    public static void main(String[] args) {
        Account account = new Account("1000", 10000);
        ThreadTest1 threadTest1 = new ThreadTest1("张三", account);
        ThreadTest1 threadTest2 = new ThreadTest1("李四", account);
        threadTest1.start();
        threadTest2.start();

    }
}
