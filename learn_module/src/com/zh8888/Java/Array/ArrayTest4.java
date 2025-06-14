package com.zh8888.Java.Array;

public class ArrayTest4 {
    public static void main(String[] args) {
        //数组反转
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; //创建临时变量，交换两个元素 数组元素被修改
        }
        //输出反转后的数组
        for (int j : arr) {
            System.out.println(j); //结果为：6 5 4 3 2 1
        }

/*
        反向遍历数组 (从后往前遍历)
        for (int i = arr.length-1; i >=0 ; i--) { //数组元素不会被修改
            System.out.println(arr[i]); //结果为：6 5 4 3 2 1 结果与上面的结果相同 但是不会修改数组元素
        }
*/
    }
}
