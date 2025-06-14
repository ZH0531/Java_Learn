package com.zh8888.Java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");//  批量添加元素

        Collections.shuffle(list);//  打乱顺序

        Collections.sort(list);//  排序

        List<Student> list1 = new ArrayList<>();
        Collections.addAll(list1, new Student("张三", 18, 1.85), new Student("李四", 19, 1.75), new Student("王五", 20, 1.75));
        Collections.sort(list1);//  排序 如果Student类没有实现Comparable接口，则报错
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(list1);

    }
}
