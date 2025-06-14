package com.zh8888.Java.Case;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入评委的个数：");
        System.out.println("去掉一个最高分去掉一个最低分\n平均得分:" + score(sc.nextInt()));
    }

    /**
     * 在唱歌比赛中，可能有多名评委要给选手打分，分数是[0-100]之间的整数。
     * 选手最后得分为：去掉最高分、最低分后剩余分数的平均分，
     * 请编写程序能够录入多名评委的分数，并算出选手的最终得分。
     */
    public static String score(int n) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分[0~100]：");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                arr[i] = num;
            } else {
                System.out.println("输入有误，请重新输入！");
                i -= 1;
            }
        }
        // 冒泡排序
        for (int k = 0; k < n - 1; k++) {
            for (int j = 0; j < n - 1 - k; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("排序后的数组为：[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
            result += arr[i];
        }
        System.out.println("]");
        System.out.println("-------------------------");
        return String.format("%.1f", (double) (result - (arr[0] + arr[n - 1])) / (n - 2));
    }
}
