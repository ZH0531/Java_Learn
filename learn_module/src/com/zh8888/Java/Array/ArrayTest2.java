package com.zh8888.Java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        //某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分。

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入6名评委的打分：");

        int[] arr = new int[6];

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
            sum += num;

        }

        System.out.println(Arrays.stream(arr).average());//使用Java8的stream API计算平均值

/*
        传统方式计算数组平均值
        double sum = 0;
        for (int score : arr) {
            sum += score;
        }
*/
        double average = sum / arr.length;
        System.out.println("平均分：" + average);



    }
}
