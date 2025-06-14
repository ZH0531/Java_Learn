package com.zh8888.Java.branch;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期：");
        String week = sc.next();
//      通过比较值来决定哪条分支
        switch (week) {
            case "周一", "周二", "周三", "周四", "周五":
                System.out.println("今天要上课！TAT...");
                break;
            case "周六":
                System.out.println("今天没课啦！QAQ开心~");
                break; // 不跳出来就会直接运行下面的代码
            case "周日":
                System.out.println("今天要晚点名！明天又要上课了TAT...");
                break;
            default:
                System.out.println("别瞎写日期！");

        }
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);
    }
}
