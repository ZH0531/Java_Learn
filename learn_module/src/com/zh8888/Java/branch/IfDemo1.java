package com.zh8888.Java.branch;

public class IfDemo1 {
    public static void main(String[] args) {
//        if 三种分支
//        1.
//        if(条件表达式){
//            代码;
//        }
        double temperature = 36.5;
        if (temperature >= 37.3) {
            System.out.println("这个人的温度是" + temperature + "快把他带走");
        }

//        2.
//        if(条件表达式){
//            代码1;
//        }else{
//            代码2;
//        }
        double money = 99;
        if (money >= 80) {
            System.out.println("发红包成功！");
        } else {
            System.out.println("余额不足！");
        }

//        3.
//        if (条件表达式) {
//            代码1
//        } else if (条件表达式) {
//            代码2
//        } else if (条件表达式) {
//            代码3
//        }
//        ...
//        else{
//            代码4
//        }
        int score = 82;
        if (score >= 0 && score <= 60) {
            System.out.println("您的成绩及格！");
        } else if (score >= 60 && score <= 70) {
            System.out.println("您的成绩为D!");
        } else if (score >= 70 && score <= 80) {
            System.out.println("您的成绩为C!");
        } else if (score >= 80 && score <= 90) {
            System.out.println("您的成绩为B!");
        } else if (score >= 90 && score <= 100) {
            System.out.println("您的成绩为A!");
        } else {
            System.out.println("你输入的成绩有毛病！");
        }


    }
}
