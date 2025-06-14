package com.zh8888.Java.Case;

public class Case05 {
    /**
     * 复制数组
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[]arr2 = copyArray(arr);
        printArray(arr2);
        int[]arr3 = copy(arr);
        printArray(arr3);
    }

    public static int[] copyArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {//复制数组
            arr2[i] = arr[i];
        }
        return arr2;
    }
    public static int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);//复制数组
        return arr2;
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
