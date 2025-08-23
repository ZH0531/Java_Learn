package com.zh8888.多线程.线程同步;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardID;
    private double money;
    final Lock lock = new ReentrantLock(); //使用lock锁的方法 并且使用final修饰

    public Account() {
    }

    public Account(String cardID, double money) {
        this.money = money;
        this.cardID = cardID;
    }

    public synchronized void drawMoney(double money) {//同步方法 锁整个方法
        System.out.println(Thread.currentThread().getName() + "尝试取款" + money + "元");
//        synchronized (this) { //同步代码块 锁一块代码
//        lock.lock();
        try {
            if (this.money >= money) {
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "取款成功，余额为：" + this.money);
            } else {
                System.out.println(Thread.currentThread().getName() + "取款失败，余额不足！");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
//            lock.unlock(); // 无论如何必须解锁 不然账户会锁住
        }
//        }
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
