package com.zh8888.Java.Array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0; //在外部定义变量，用于存储数组元素的和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组求和" + sum);

    }
}
