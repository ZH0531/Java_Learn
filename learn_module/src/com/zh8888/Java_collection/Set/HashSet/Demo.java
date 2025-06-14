package com.zh8888.Java_collection.Set.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set.add(52);
        set.add(52);// HashSet不允许重复，如果重复第二个会不存
        set.add(246);
        set.add(822);
        set.add(99);
        //无序：添加的顺序和输出的顺序不一致
        System.out.println(set);

        set1.add(52);
        set1.add(246);
        set1.add(246);//  LinkedHashSet不允许重复
        set1.add(822);
        set1.add(99);
        //有序：添加的顺序和输出的顺序一致
        System.out.println(set1);

        set2.add(1);
        set2.add(5);
        set2.add(5);//  TreeSet不允许重复
        set2.add(3);
        set2.add(2);
        //排序：自动进行排序
        System.out.println(set2);

    }
}
