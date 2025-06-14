package com.zh8888.Java.Case;

public class Case07 {
    /**
     * 九九乘法表
     * 打印杨辉三角
     * */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
        int n = 30;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(j % 2 == 0 ? " " : "*");//偶数列输出空格，奇数列输出*
            }
            System.out.println();
        }
    }
}
