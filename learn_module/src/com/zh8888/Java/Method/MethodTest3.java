package com.zh8888.Java.Method;

public class MethodTest3 {
    public static void main(String[] args) {
        //比较两个数组是否相等 返回true或false

        int[] arr1 = {12, 34, 56, 78, 90};
        int[] arr2 = {12, 34, 56, 78, 90};
        boolean bool = method1(arr1, arr2);
        System.out.println(bool);
    }

    public static boolean method1(int[] arr1, int[] arr2) {
        //以下代码使用了卫语句，用于减少‌if-else嵌套，提高代码的可读性和效率
        //在Java中，卫语句的常见形式是使用if语句和return语句组合
        //判断两个数组是否都为null
        if (arr1 == null && arr2 == null) {
            System.out.println("两个数组都为空,所以相等");
            return true;
        }
        //判断两个数组是否为空
        if (arr1 == null || arr2 == null) {
            System.out.println("有一个数组为空");
            return false;
        }
        //判断两个数组长度是否相等
        if (arr1.length != arr2.length) {
            return false;
        }
        //判断两个数组元素是否相等
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("数组元素不相等");
                return false;
            }
        }
        return true;
    }
}
