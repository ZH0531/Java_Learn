package com.zh8888.Java.Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {
        //随机排名
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        // 输入10个成绩到数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + (i + 1) + "名的成绩：");
            arr[i] = scanner.nextInt();
        }

        // 使用随机交换算法打乱数组顺序
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int a = rand.nextInt(arr.length - 1);
            int temp = arr[i];
            arr[i] = arr[a];
            arr[a] = temp;
        }

        // 输出打乱后的成绩顺序
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
