package com.zh8888.Java_collection.Set.TreeSet;

import com.zh8888.Java_collection.Set.HashSet.Student;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
//        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });

//        Set<Student> set = new TreeSet<>((o1, o2)-> Double.compare(o1.getHeight(), o2.getHeight()));

        Set<Student> set = new TreeSet<>(Comparator.comparingDouble(Student::getHeight));

        Student s1 =  new Student("张er", 18, 188.7);
        Student s2 =  new Student("张三", 18, 188.7);
        //重写了compareTo方法，s1和s2是相等的（因为age比较）
        //因为红黑树规则，如果两个对象相等，那么就只能存一个对象，所以s1和s2只会存一个对象 第二个不存
        Student s3 =  new Student("李四", 19, 185.7);
        Student s4 =  new Student("王五", 20, 180.7);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
