package com.zh8888.Java.variable;

public class Variable {
    public static void main(String[] args) {
        // 1. 定义一个整型变量
        int age = 17;
        System.out.println("年龄: " + age);
        // 2. 定义一个小数变量
        double score = 88.8;
        System.out.println("分数: " + score);

        System.out.println("----------------------------------");

        // 3. 使用变量的好处，便于拓展和维护
        int num = 666;
        for (int i = 0; i < 6; i++) {
            System.out.println("数字: " + num);
        }
        System.out.println("----------------------------------");

        // 4. 变量的特点: 里面装的数据可以被替换
        int currentAge = 18;
        System.out.println("当前年龄: " + currentAge);
        currentAge = 19;  // 更新年龄
        System.out.println("更新后的年龄: " + currentAge);
        currentAge += 1;  // 再次更新年龄
        System.out.println("再次更新后的年龄: " + currentAge);
        System.out.println("----------------------------------");

        // 5. 钱包操作示例
        double walletBalance = 9.5;
        System.out.println("初始钱包余额: " + walletBalance);

        // 收到10元红包
        walletBalance += 10;
        System.out.println("收到红包后的余额: " + walletBalance);

        // 发出5元红包
        walletBalance -= 5;
        System.out.println("发出红包后的余额: " + walletBalance);
    }
}
