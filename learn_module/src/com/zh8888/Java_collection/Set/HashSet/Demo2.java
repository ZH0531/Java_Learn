package com.zh8888.Java_collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student s1 =  new Student("张三", 18, 188.7);
        Student s2 =  new Student("张三", 18, 188.7);//不存
        //HashSet存储自定义对象时，必须重写hashCode()和equals()方法,否则会出现重复
        // (默认情况下，HashSet存储自定义对象时，存储的是对象的地址值，所以会出现重复)
        Student s3 =  new Student("李四", 19, 185.7);
        Student s4 =  new Student("王五", 20, 180.7);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
