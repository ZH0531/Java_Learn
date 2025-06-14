package com.zh8888.Java.loop;

import java.util.Random;

public class Random_demo {
    public static void main(String[] args) {
        // 创建一个Random对象，用于生成随机数
        Random random = new Random();
        // 循环50次
        for (int i = 0; i < 50; i++) {
            // 生成一个范围在65到90之间的随机整数（包括65和90）
            int number = random.nextInt(65, 91);

            // 如果生成的随机数小于等于66，则打印该随机数
            if (number <= 66) {
                System.out.println(number);
            }
        }
    }
}
