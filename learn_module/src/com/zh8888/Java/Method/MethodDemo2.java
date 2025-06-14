package com.zh8888.Java.Method;

public class MethodDemo2 {
    public static void main(String[] args) {
        //方法的值传递 分为基本类型和引用类型

        //基本类型的值传递 传输存储在栈内存中的的数据值
        int num = 10;
        method1(num);
        System.out.println(num);//输出10
        System.out.println("--------------------------");

        //引用(对象)类型的参数传递 传递的是存储在堆内存中的地址值
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        method2(arr1);
        System.out.println(arr1[1]); //由于传递的是地址值，堆内存中的值已经被改变 所以输出10（改变后的值）
    }

    public static void method1(int a) {
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }

    public static void method2(int[] arr) {
        System.out.println(arr[1]);
        arr[1] = 10;
        System.out.println(arr[1]);
    }
}
