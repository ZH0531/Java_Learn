package com.zh8888.Java_API.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    /**
     * 主函数，用于演示ArrayList的基本操作。
     *
     * @param args 命令行参数，未使用。
     */
    public static void main(String[] args) {
        // 创建一个Object类型的ArrayList对象，并添加不同类型的元素
        ArrayList<Object> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add(1);
        list.add(1.1);
        list.add(1.1);
        list.add(1.1);
        System.out.println(list);

        // 创建一个String类型的ArrayList对象，并添加一些元素
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("world");
        System.out.println(list1);


        // 在指定位置插入元素
        list.add(1, "world");
        System.out.println(list);

        // 获取指定位置的元素并打印
        System.out.println(list.get(2));

        // 打印列表的大小
        System.out.println(list.size());

        // 在指定位置插入元素，并打印列表
        list.add(2, "hello");
        System.out.println(list);

        // 移除指定位置的元素，并打印被移除的元素和列表
        System.out.println(list.remove(2));
        System.out.println(list);

        // 移除列表中第一个匹配的元素，并打印是否被移除和列表
        System.out.println(list.remove("hello"));
        System.out.println(list);

        // 移除列表中第一个匹配的整数元素，并打印是否被移除和列表
        System.out.println(list.remove(Integer.valueOf(1)));
        //必须用 Integer.valueOf(1)，否则会被当作删除索引 1 的元素！
        System.out.println(list);

        //移除列表中所有匹配的元素
        list.removeIf(num -> num.equals(1.1)); // 使用equals比较对象
        System.out.println(list);

        // 修改指定位置的元素，并打印列表
        list.set(0, "hello");
        list.set(1, "world");
        System.out.println(list);
    }
}
