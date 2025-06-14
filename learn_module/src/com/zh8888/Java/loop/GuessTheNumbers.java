package com.zh8888.Java.loop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int num = r.nextInt(1, 100);
        int i = 0;
        while (true) {
            System.out.println("请输入你猜的数字：");
            int guess = s.nextInt();
            i++;
            if (guess > num) {
                System.out.println("猜的数字大了！");
            } else if (guess < num) {
                System.out.println("猜的数字小了！");
            } else {
                System.out.printf("恭喜你用了%d次就猜对了！", i);
                break;
            }
        }
    }
}

