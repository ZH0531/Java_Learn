package com.zh8888.Java_API.String;

public class StringDemo1 {
    /**
     * 主函数，用于演示不同方式创建和输出字符串。
     *
     * @param args 命令行参数，本函数未使用该参数。
     */
    public static void main(String[] args) {
        // 直接使用字符串字面量创建并输出字符串
        String name = "涵涵";
        System.out.println(name);

        // 使用默认构造函数创建一个空字符串并输出
        String s1 = new String();
        System.out.println(s1);

        // 使用带参数的构造函数创建并输出字符串
        String s2 = new String("hanhan");
        System.out.println(s2);

        // 使用字符数组创建并输出字符串
        char[] chars = {'h', 'a', 'n', 'h', 'a', 'n'};
        String s3 = new String(chars);
        System.out.println(s3);

        // 使用字节数组创建并输出字符串
        byte[] bytes = {104, 97, 110, 104, 97, 110};
        String s4 = new String(bytes);
        System.out.println(s4);
    }


}
