package com.zh8888.Java.variable;

public class variable2 {
    public static void main(String[] args) {
//      1、变量要先声明才能使用。
        int age = 18;
        System.out.println(age);
//      2、变量是什么类型，就应该用来装什么类型的数据，否则报错。
//      age =9.8;
//      3、变量是从定义开始到”}"截止的范围内有效;且同一个范围内，定义的多个变量，它们的名称不能一样。
        {
            int a = 19;
//            int a = 23;  // 且同一个范围内，定义的多个变量，它们的名称不能一样。
            System.out.println(a);
        }
//      System.out.println(a);
        System.out.println(age);
        int a = 23;
        System.out.println(a);
//        int age = 25;  // 且同一个范围内，定义的多个变量，它们的名称不能一样。
//      4、变量定义的时候可以不赋初始值;但在使用时，变量里必须有值，否则报错。
        int number;
        number = 100;
        System.out.println(number);
    }
}
/*
    标识符：
    基本组成:由数字、字母、下划线()和美元符($)等组成
    强制要求:不能以数字开头、不能用关键字做为名字、且是区分大小写的。

    标识符的建议规范：
    变量名称:满足标识符规则，同时建议用英文、有意义、首字母小写，满足“驼峰模式“
    类名称:满足标识符规则，建议全英文、有意义、首字母大写，满足“驼峰模式”
*/
