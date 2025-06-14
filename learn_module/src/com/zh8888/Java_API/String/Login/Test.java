package com.zh8888.Java_API.String.Login;

import java.util.Scanner;

/**
 * 登录验证
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login[] users = new Login[3];
        users[0] = new Login("admin", "123456");
        users[1] = new Login("ZH0531", "1314520");
        users[2] = new Login("ZH8888", "888888");
        LoginOperator loginOperator = new LoginOperator(users);

        String userName, password;
        int count = 3;
        boolean check;
        System.out.println("====登录系统====");
        do {
            System.out.println(count == 3 ? "请输入用户名：" : "请重新输入用户名：");
            userName = sc.next();
            System.out.println(count == 3 ? "请输入密码：" : "请重新输入密码：");
            password = sc.next();
            check = loginOperator.isLoginFailed(userName, password);
            count--;
            if (check && count > 0) {
                System.out.printf("还剩%d次机会\n", count);
            }
            System.out.println("--------------");
        } while (check && count > 0);

        if (check) {
            System.out.println("登录次数已达上限！");
        }
    }
}

