package com.zh8888.Java.Array;

/**
 * 数组声明三种写法示例：
 * 1. 标准写法：类型[] 数组名 = new 类型[]{...}
 * 2. 简化写法：类型[] 数组名 = {...}（自动推导数组长度）
 * 3. C语言风格写法：类型 数组名[] = {...}（不推荐）
 */
public class ArrayDemo1 {
    /**
     * 主方法展示不同数组声明方式：
     * - arr/arr2 使用标准new语法
     * - arr3/arr4 使用简化初始化语法
     * - arr5/arr6 使用C语言风格声明方式
     */
    public static void main(String[] args) {
        // 静态数组
        int[] arr = new int[]{1, 2, 3, 4, 5};
        double[] arr2 = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(arr); // [I@1540e19d [ 数组 I 数据类型 地址 1544e19d
        System.out.println(arr2);// [D@7f1a544d [ 数组 D 数据类型 地址 7f1a545d

        int[] arr3 = {1, 2, 3, 4, 5};
        double[] arr4 = {1.1, 2.2, 3.3, 4.4, 5.5};

        int arr5[] = {1, 2, 3, 4, 5};
        double arr6[] = {1.1, 2.2, 3.3, 4.4, 5.5};

        // 以上三种声明方式都可以，但是不推荐使用C语言风格声明方式，因为它不符合Java语法规范

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println();

        arr[0] = 10;
        System.out.println(arr[0]);
        System.out.println();

        System.out.println(arr.length);//数组长度
        System.out.println(arr.length - 1);//最大索引值(前提是数组长度大于0 也就是说数组存在元素)
        System.out.println();
        // 遍历数组
        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) { //arr.fori快捷键
            System.out.println(arr[i]);
        }
        for (int j : arr) { //加强for循环
            System.out.println(j);
        }



    }
}
