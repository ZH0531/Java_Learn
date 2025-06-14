package com.zh8888.Java.Case;

import java.util.Scanner;

public class Case04 {
    /**
     * 对称加密解密
     */
    public static void main(String[] args) {
        //对称加密解密
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的四位数：");
        System.out.println("加密后的数字为：" + Decryption(sc.nextInt()));
        System.out.println("-----------------");
        System.out.println("请输入要解密的四位数：");
        System.out.println("解密后的数字为：" + Decryption(sc.nextInt()));
    }

    public static int Decryption(int n) {
        int[] arr = arr(n);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        arr2(arr);
        StringBuilder num = new StringBuilder();
        for (int j : arr) {
            num.append(j);
        }
        return Integer.parseInt((num.toString()));//转换为int类型
    }

    public static void arr2(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] arr(int n) {
        int[] arr = new int[4];
        arr[0] = n / 1000;
        arr[1] = n / 100 % 10;
        arr[2] = n / 10 % 10;
        arr[3] = n % 10;
        return arr;
    }
}
