package com.zh8888.Java_oop.Interface.PeopleManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 教师信息操作实现类B
 * 实现打印和添加教师信息的功能
 */
public class Impl_B implements Print<Teacher>, Add<Teacher> {
    /**
     * 打印教师信息列表
     * @param list 教师数据列表
     * 显示每个教师的详细信息
     */
    @Override
    public void print(ArrayList<Teacher> list) {
        if (list.isEmpty()) {
            System.out.println("班级中没有教师，无法打印信息");
            return;
        }
        System.out.println("=======教师信息=======");
        for (Teacher teacher : list) {
            System.out.println("教师编号："+teacher.getTeacherId()+
                    " 姓名: " + teacher.getName() +
                    " 性别: " + teacher.getSex() +
                    " 教授科目: " + teacher.getSubjects() +
                    " 年龄: " + teacher.getAge());
        }
    }

    /**
     * 添加新教师信息
     * @param teacher 需要添加的教师对象
     * @return 添加成功的教师对象
     * 通过控制台输入收集教师详细信息
     */
    @Override
    public Teacher add(Teacher teacher) {
        System.out.println("========添加教师=========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入教师姓名：");
        teacher.setName(scanner.next());
        System.out.println("请输入教师性别：");
        teacher.setSex(scanner.next().charAt(0));
        System.out.println("请输入教师教授科目：");
        teacher.setSubjects(scanner.next());
        System.out.println("请输入教师年龄：");
        teacher.setAge(scanner.nextInt());
        System.out.println("教师信息添加成功！");
        System.out.println("=======================");
        return teacher;
    }
}
