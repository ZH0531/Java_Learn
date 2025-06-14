package com.zh8888.Java.Method;

public class MethodTest2 {
    public static void main(String[] args) {
        //输出一个int类型的数组内容，要求输出格式为：[11,22,33,44，55]
        int[] arr1 = new int[]{11, 22, 33, 44, 55};
        printIntArray(arr1); // 输出：[11,22,33,44,55]

        int[] arr2 = null;
        printIntArray(arr2); // 输出：数组内容为null

        int[] arr3 = {};
        printIntArray(arr3); // 输出：数组内容为空
    }

    public static void printIntArray(int[] arr) {
        if (arr == null) { // 可选判断数组是否为0(arr == null || arr.length == 0)
            System.out.println("数组内容为null");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                System.out.print(arr[i]);
//            } else {
//                System.out.print(arr[i] + ",");
//            }
            //可简化为三元运算符
            System.out.print((arr.length - 1 == i) ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}

