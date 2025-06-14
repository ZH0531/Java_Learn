package com.zh8888.Java.Array;

public class ArrayDemo3 {
    public static void main(String[] args) {

        // 数组的复制 - 引用传递 - 数组的地址是一样的 - 所以修改其中一个数组的值，另一个数组也会跟着改变
        // 多个数组变量指向同一个数组的地址 arr、arr2在栈内存中存储的是该数组在堆内存中的地址

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = arr;

        System.out.println(arr);
        System.out.println(arr2);// 输出地址相同

        arr2[0] = 10;// 修改arr2数组的值

        System.out.println(arr[0]);//arr[0]的值也会跟着改变，因为arr2和arr指向同一个数组

        arr2 = null;
        System.out.println(arr2);// 输出null，因为arr2指向的数组已经不存在了
        System.out.println(arr2[0]);// 输出报错，因为arr2指向的数组已经不存在了 空指针异常
    }
}
