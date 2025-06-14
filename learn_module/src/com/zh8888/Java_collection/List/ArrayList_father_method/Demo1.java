package com.zh8888.Java_collection.List.ArrayList_father_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黑枸杞");
        list.add("Java入门教程");
        list.add("外星枸杞");
        List<String> list2 = new ArrayList<>();
        list2.add("拖鞋");
        list2.add("宁夏枸杞");
        list2.add("枸杞子");
        System.out.println(list2);

        list.addAll(list2);//  在末尾添加list2
        list.addAll(1, list2);//  在索引1处添加list2
        System.out.println(list);

        System.out.println(list.get(0));//  获取索引0的元素
        System.out.println(list.set(0, "拖鞋"));// 替换索引0的元素并返回旧元素
        System.out.println(list);

        System.out.println(list.contains("黑枸杞"));//  判断是否包含

        System.out.println(list.indexOf("Java入门教程"));//  查询索引
//        list2.clear();//  清空list2
//        System.out.println(list2.isEmpty());//  判断list2是否为空

        System.out.println(list2.size());//  获取list2的长度

        list2.remove(1);//  移除索引1的元素
        list2.remove("拖鞋");//  移除"拖鞋"元素

        Object[] array = list2.toArray();//  将list2转换为数组
        System.out.println(Arrays.toString(array));

        String[] array1 = list.toArray(new String[list.size()]);//  将list转换为数组
        System.out.println(Arrays.toString(array1));


    }
}
