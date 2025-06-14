package com.zh8888.Java.loop;

import java.util.Scanner;

public class ForDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入行数：");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
//      for (int i = n; i >= 0; i--) { 倒着等腰三角形
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
