package com.zh8888.Java_API.String;

import java.util.Random;

/**
 * 验证码(captcha)生成
 */

public class StringTest2 {
    public static void main(String[] args) {
        System.out.println(captcha(6));
    }

    public static StringBuilder captcha(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder captcha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            random.nextInt(str.length());
            captcha.append(str.charAt(random.nextInt(str.length())));
        }
        return captcha;
    }
}
