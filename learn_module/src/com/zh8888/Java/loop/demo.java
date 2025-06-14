package com.zh8888.Java.loop;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("请输入成绩：");
//        double sum = scanner.nextDouble();
//        String s = sum >= 60 ? "成绩及格" : "成绩不及格";
//        System.out.println(s);

        int sum1 = 1;
        int sum2 = 2;
        int sum3 = 3;
//        int max =  sum1 > sum2 ? sum1 : sum2 > sum3 ? sum2 : sum3;
        int max = sum1 > sum2 ? sum1 : sum2;
        int max2 = max >sum3 ? max : sum3;
        System.out.println(max2);
    }
}