package com.zh8888.多线程.线程同步;

public class ThreadTest1 extends Thread {
    private Account account;

    ThreadTest1() {
    }

    ThreadTest1(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        account.drawMoney(10000);
    }
}
