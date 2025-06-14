package com.zh8888.Java.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
        //方法调用
        int result = add_ab(10, 20);
        System.out.println("求和结果为: " + result);
        System.out.println("-------------------------------");

        printHello(5);


    }
    //==================================================
    //    方法定义
    public static int add_ab(int a, int b) { //int表示方法返回int类型的值
        return a + b; //需要声明返回值类型int才能返回值
    }

    //
    public static void printHello(int n) { //void表示方法没有返回值
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World!");
        }
        // 无返回值的方法，不需要return语句 但是需要声明返回值类型void
    }
}
