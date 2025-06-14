package com.zh8888.Java_API.String;

public class StringDemo2 {
    /**
     * 主函数，用于演示字符串的常见操作。
     *
     * @param args 命令行参数，未使用。
     */
    public static void main(String[] args) {

        // 定义两个字符串，用于演示字符串的基本操作
        String str1 = "hanhan";
        String str2 = "Hanhan";

        // 输出字符串的长度
        System.out.println(str1.length());

        // 输出字符串的第一个字符
        System.out.println(str1.charAt(0));

        // 将字符串转换为字符数组并逐个输出
        char[] chars = str1.toCharArray();
        for (char c : chars) {
            System.out.print(c);
        }
        System.out.println();

        // 比较两个字符串是否相等（区分大小写）
        System.out.println(str1.equals(str2));
        // 比较两个字符串是否相等（不区分大小写）
        System.out.println(str1.equalsIgnoreCase(str2));

        // 截取字符串的子串，但未使用结果
        str1.substring(0, 3);
        str1.substring(3);

        // 定义包含敏感词的字符串，并演示替换操作
        String str3 = "你个垃圾，菜逼玩意！";
        // 使用replace方法替换敏感词
        String str4 = str3.replace("垃圾", "**").replace("菜逼", "**");
        // 使用replaceAll方法替换敏感词
        String str5 = str3.replaceAll("垃圾|菜逼", "**");
        System.out.println(str4);
        System.out.println(str5);

        // 检查字符串是否包含特定子串
        System.out.println(str3.contains("垃圾"));
        System.out.println(str4.contains("垃圾"));

        // 检查字符串是否以特定字符或子串开头
        System.out.println(str1.startsWith("H"));
        System.out.println(str1.startsWith("h", 3));

        // 使用逗号分割字符串，并输出分割后的子串
        String[] strings = str3.split("，");
        for (String s : strings) {
            System.out.println(s);
        }

    }
}


















