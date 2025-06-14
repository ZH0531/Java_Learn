package com.zh8888.Java.loop;

import java.util.Scanner;

public class WhileDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double m = 8848860;
//        0.1 0.2 0.4 0.8 1.6
//        c = c*2
        int answer = 0;
        double i = 0.1;
        while (i < m) {
            i *= 2;
            System.out.println(i);
            answer++;
        }
        System.out.println("需要折叠："+answer+"次");
    }
}
