package com.zh8888.Java.Case;

import java.util.Random;

public class Case02_1 {
    public static void main(String[] args) {
        System.out.println(yzm(6));
    }

    /**
     * 生成指定长度的验证码字符串，包含小写字母、大写字母和数字。
     *
     * @param n 验证码的长度
     * @return 生成的验证码字符串
     */
    public static String yzm(int n) {
        Random ra = new Random();
        StringBuilder yzm = new StringBuilder();

        // 循环生成每个字符
        for (int i = 0; i < n; i++) {
            int r = ra.nextInt(3);

            // 根据随机选择决定字符类型并添加到验证码中
            switch (r) {
                case 0:
                    yzm.append((char) (ra.nextInt(26) + 'a'));
                    break;
                case 1:
                    yzm.append((char) (ra.nextInt(26) + 'A'));
                    break;
                case 2:
                    yzm.append(ra.nextInt(10));
                    break;
            }
        }
        return yzm.toString();
    }
}
