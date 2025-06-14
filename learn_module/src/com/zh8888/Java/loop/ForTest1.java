package com.zh8888.Java.loop;

import java.util.Scanner;

public class ForTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入科目数量：");
        int j = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= j; i++) {
            System.out.println("请输入第" + i + "科成绩：");
            sum += sc.nextDouble();
        }
        System.out.println(j + "科成绩的平均分为：" + String.format("%.2f", sum / j));
    }
}