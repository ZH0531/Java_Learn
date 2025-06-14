package com.zh8888.Java.Case;

import java.util.Scanner;

public class Case06_1 {
    /**
     输入两个数字，求出这两个数字之间有多少个素数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入结束数字：");
        int num2 = sc.nextInt();
        System.out.println(num1 + "到" + num2 + "之间有" + sushu(num1, num2) + "个素数");
    }

    private static int sushu(int num1, int num2) {
        int result = 0;// 记录素数的个数
        if (num1 == 1) {
            num1++;// 从2开始
        }
        OUT:
        //给for循环命名OUT
        for (int i = num1; i <= num2; i++) {// 遍历num1到num2
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) { //当有一个数能整除，则不是素数
                    continue OUT; // 跳出外层循环
                }
            }
            System.out.println(i);
            result++;//
        }
        return result;
    }
}

