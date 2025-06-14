package com.zh8888.Java.Case;

import java.util.Random;

public class Case02 {
    public static void main(String[] args) {
        System.out.println(yzm(6));
    }

    /**
     * 生成指定长度的随机验证码字符串
     *
     * @param n 验证码长度
     * @return 包含字母（大小写）和数字的随机字符串
     */
    public static String yzm(int n) {
        // 可用字符集合（包含小写字母、大写字母和数字）
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Random ra = new Random();
        StringBuilder yzm = new StringBuilder();

        // 循环生成指定数量的随机字符并拼接
        for (int i = 0; i < n; i++) {
            int r = ra.nextInt(s.length);
            yzm.append(s[r]);
        }
        return yzm.toString();
    }

}
