package com.zh8888.Java_ATM;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    ArrayList<Account> accounts = new ArrayList<>();

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用ATM系统！");
        while (true) {
            System.out.println("===============ATM主菜单===============");
            System.out.println("当前时间：" + getCurrentTime());
            System.out.println("1.登录账号");
            System.out.println("2.注册账号");
            System.out.println("3.退出");
            System.out.println("请输入您的选择：");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    login();
                    break;
                case "2":
                    register();
                    break;
                case "3":
                    System.out.println("退出成功！");
                    return;
                default:
                    System.out.println("输入错误！请重新选择！");
                    break;
            }
        }
    }

    private Account login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============登录账号===============");
        while (true) {
            System.out.println("请输入卡号：");
            String cardId = sc.nextLine();
            if (cardId.length() != 16) {
                System.out.println("卡号长度必须为16位！请重新输入！");
                continue;
            }
            Account account = getAccountByCardId(cardId);
            if (account == null) {
                System.out.println("卡号不存在！请重新输入！");
            } else {
                while (true) {
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();
                    if (account.getPassword().equals(password)) {
                        System.out.println("登录成功！");
                        return account;
                    } else {
                        System.out.println("密码错误！请重新输入！");
                    }
                }
            }
        }
    }


    private void register() {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("===============正在开户================");
        System.out.println("当前时间：" + getCurrentTime());
        // 设置姓名
        while (true) {
            System.out.println("请输入您的姓名：");
            String name = sc.nextLine();
            if (name.length() < 2 || name.length() > 5) {
                System.out.println("姓名长度必须在2-5个字之间！请重新输入！");
                continue;
            }
            account.setName(name);
            break;
        }
        // 设置性别
        while (true) {
            System.out.println("请输入你的性别：");
            String gender = sc.nextLine();
            if (gender.equals("男") || gender.equals("女")) {
                account.setGender(gender);
                break;
            } else {
                System.out.println("性别只能是男或女！请重新输入！");
            }
        }
        // 设置密码
        while (true) {
            System.out.println("请设置您的密码(六位数)：");
            String password = sc.nextLine();
            if (password.matches("[0-9]{6}")) {
                System.out.println("请再次确认您的密码：");
                String password2 = sc.nextLine();
                if (password.equals(password2)) {
                    account.setPassword(password);
                    break;
                } else {
                    System.out.println("两次密码不一致！请重新输入！");
                }
            } else {
                System.out.println("密码只能是六位数数字！请重新输入！");
            }
        }
        // 设置限额
        System.out.println("请您输入限额额度：");
        while (true) {
            try {
                int quota = sc.nextInt();
                if (quota < 0) {
                    System.out.println("限额额度必须大于0！请重新输入！");
                    continue;
                }
                account.setQuota(quota);
                break;
            } catch (InputMismatchException e) {
                System.out.println("输入有误！请重新输入！");
                sc.nextLine();
            }
        }
        // 设置卡号
        account.setCardID(createCardId());

        accounts.add(account);
        System.out.println("恭喜您，" + account.getName() + account.Gender() + ",您于 " + getCurrentTime() + " 于我行开户成功！");
        System.out.println("您的卡号是：" + account.getCardID());
        System.out.println("您的单笔限额为：" + account.getQuota() + "元");
        System.out.println("请牢记您的卡号和密码！");
        System.out.println("======================================");
        System.out.println();
        //此处等待一秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String createCardId() {
        Random random = new Random();
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) { // 生成16位数字
                sb.append(random.nextInt(10)); // 生成0-9的随机数
            }
            if (getAccountByCardId(sb.toString()) == null) {
                return sb.toString();
            }
        }
    }

    private Account getAccountByCardId(String cardId) {
        for (Account account : accounts) {
            if (account.getCardID().equals(cardId)) {
                return account;
            }
        }
        return null;
    }

    private String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
