package com.zh8888.Java.loop;

public class WhileDemo2 {
    public static void main(String[] args) {
        double m = 8848860; // 珠穆朗玛峰高度，单位：毫米
        int answer = 0; // 记录折叠次数
        double i = 0.1; // 初始纸张厚度，单位：毫米

        // 使用 for 循环折叠纸张厚度
        for (; i < m; ) {
            i *= 2;  //如果放到括号里面会先执行下面的语句再执行i*=2，第一次输出为0.1，最后一次执行但是不输出，在循环外可以输出
            System.out.println(i); // 输出当前折叠后的厚度
            answer++;
        }

        // 输出折叠后的次数和最后一次的 i 值
        System.out.println("需要" + answer + "次");
        // 这里确保输出最后一次折叠后的厚度
        System.out.println("最后一次折叠后的厚度：" + i);
    }
}
