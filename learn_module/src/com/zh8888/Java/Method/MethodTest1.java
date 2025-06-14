package com.zh8888.Java.Method;

import java.util.Random;

public class MethodTest1 {
    public static void main(String[] args) {
        System.out.println(result_atob(5, 10));
        System.out.println("---------------------------");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            number(num);
        }
    }
    // 定义一个方法，用于判断一个数字是奇数还是偶数
    public static void number(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "是偶数");
        } else {
            System.out.println(n + "是奇数");
        }
    }

    // 定义一个方法，用于计算从a到b的和
    public static int result_atob(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result += i;
        }
        return result;
    }

}
