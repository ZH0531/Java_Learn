package com.zh8888.Java_API.ArrayList;

import java.util.ArrayList;

public class ArrayListTest1 {
    /**
     * 主函数，用于演示从ArrayList中移除包含特定字符串的元素的不同方法。
     * 该函数创建了三个相同的ArrayList，分别使用不同的方法移除包含"枸杞"的元素，
     * 并输出移除后的结果，以展示不同方法的差异。
     *
     * @param args 命令行参数，未使用。
     */
    public static void main(String[] args) {
        // 创建并初始化第一个ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("黑枸杞");
        list.add("Java入门教程");
        list.add("外星枸杞");
        list.add("拖鞋");
        list.add("宁夏枸杞");
        list.add("枸杞子");

        // 创建并初始化第二个ArrayList，与第一个相同
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("黑枸杞");
        list2.add("Java入门教程");
        list2.add("外星枸杞");
        list2.add("拖鞋");
        list2.add("宁夏枸杞");
        list2.add("枸杞子");

        // 创建并初始化第三个ArrayList，与第一个相同
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("黑枸杞");
        list3.add("Java入门教程");
        list3.add("外星枸杞");
        list3.add("拖鞋");
        list3.add("宁夏枸杞");
        list3.add("枸杞子");

        // 使用removeIf方法移除包含"枸杞"的元素
        list.removeIf(str -> str.contains("枸杞"));
        System.out.println(list);

        // 使用正序遍历并移除包含"枸杞"的元素，注意调整索引以避免跳过元素
        for (int i = 0; i <= list2.size() - 1; i++) {
            if (list2.get(i).contains("枸杞")) {
                list2.remove(i);
                i--;
            }
        }
        System.out.println(list2);

        // 使用倒序遍历并移除包含"枸杞"的元素，避免索引错乱
        for (int i = list3.size() - 1; i >= 0; i--) {
            if (list3.get(i).contains("枸杞")) {
                list3.remove(i);
            }
        }
        System.out.println(list3);
    }
}
