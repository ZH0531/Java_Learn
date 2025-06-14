package com.zh8888.Java.Case;

import java.util.Scanner;

public class Case06_2 {
    /**
    输入两个数字，求出这两个数字之间有多少个素数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入结束数字：");
        int num2 = sc.nextInt();

        int result = 0;// 记录素数的个数
        int num3 = num1;//确保下面print语句的num3的值为num1,因为当num1等于1时，直接输出num1会被修改成2
        if (num1 == 1) {
            num1++;
        }//这段代码的作用是当num1的值为1时，从2开始

        for (int i = num1; i <= num2; i++) {// 遍历num1到num2
            if (check(i)) {
                System.out.println(i);
                result++;//
            }
        }
        System.out.println(num3 + "到" + num2 + "之间有" + result + "个素数");
    }

    public static boolean check(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) { //当有一个数能整除，则不是素数
                return false;
            }
        }
        return true;
    }
}