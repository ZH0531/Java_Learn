package com.zh8888.Java.type;

public class type {
    public static void main(String[] args) {
        // 目标:掌握表达式的自动类型转换机制
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs);
        // 结果:60
        double rs2 = a + b + 1.0;
//        1.0是double类型，所以result2会自动转换为double类型
        System.out.println(rs2);
        // 结果:31.0

        byte i = 10;
        short j = 30; // short类型占2个字节，所以可以容纳范围更大的整数
        int rs3 = i + j; // 自动类型转换
        System.out.println(rs3);
        // 结果:40

//      面试笔试题:
        byte b1 = 110;
        byte b2 = 80;
        int b3 = b1 + b2; // 自动类型转换
        System.out.println(b3);
        // 结果:190

//        强制类型转换
        int a1 = 10;
        byte a2 = (byte) a1;
        System.out.println(a2);
        // 结果:10

        int c1 = 1500; // 超出byte类型范围
        byte c2 = (byte) c1;
        System.out.println(c2);
        // 结果:-36 数据损坏 大范围类型的变量直接赋值给小范围类型的变量时，
        // 会发生数据损坏，因为小范围类型只能容纳较小的范围。



    }
}
