package com.zh8888.Java.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的名字：");
        String name = sc.next();
        System.out.println("欢迎，"+name+"!");
//      三元运算符 表达式 ? 数值1 : 数值2
        String pd = age >= 18 ? "成年了" : "未成年";
        System.out.println(pd);
    }
}
