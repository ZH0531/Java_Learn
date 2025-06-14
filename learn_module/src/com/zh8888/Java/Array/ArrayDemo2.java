package com.zh8888.Java.Array;

public class ArrayDemo2 {
    public static void main(String[] args) {

        //动态初始化数组
        int[] arr = new int[5]; // arr = {0, 0, 0, 0, 0} 默认值是0
        System.out.println(arr[0]);

        double[] arr2 = new double[3]; // arr2 = {0.0, 0.0, 0.0} 默认值是0.0
        System.out.println(arr2[0]);

        char[] arr3 = new char[2]; // arr3 = {'\u0000', '\u0000'} 默认值是'\u0000' 也就是0
        System.out.println((int) arr3[0]);

        boolean[] arr4 = new boolean[2]; // arr4 = {false, false} 默认值是false
        System.out.println(arr4[0]);

        String[] arr5 = new String[2]; // arr5 = {"", ""} 默认值是"" 也就是null 引用类型都是null
        System.out.println(arr5[0]);

        //数组赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //遍历数组
        for (int j : arr) {
            System.out.println(j);// 1 2 3 4 5
        }
    }
}
