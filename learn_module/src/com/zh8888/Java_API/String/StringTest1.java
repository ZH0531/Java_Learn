package com.zh8888.Java_API.String;

import java.util.Scanner;
/**
 * 登录验证
 */

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (check(userName, password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("登录失败！");
            }
        }
    }
    public static boolean check(String userName, String password) {

        return userName.equalsIgnoreCase("ZH0531") && password.equals("123456");
    }
}
