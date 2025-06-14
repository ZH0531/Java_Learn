package com.zh8888.Java_collection.List.ArrayList_father_method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class Demo2_bianli {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        //迭代器遍历
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {//hasNext()判断集合中是否有下一个元素
            String next = iterator.next();//next()获取当前元素并且移动到下一个元素
            System.out.println(next);
        }
        System.out.println("-----------------------");

        //增强for循环遍历
        for (String s : c) { //增强for循环
            System.out.println(s);
        }
        System.out.println("-----------------------");

        //Lambda表达式遍历
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("-----------------------");

        //Lambda表达式
        c.forEach( s -> System.out.println(s));
        System.out.println("-----------------------");

        //方法引用
        c.forEach(System.out::println);

    }
}
