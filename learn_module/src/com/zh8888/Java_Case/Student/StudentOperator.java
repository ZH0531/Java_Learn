package com.zh8888.Java_Case.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentOperator {
    List<Student> studentList = new ArrayList<>();
    int id = 20250000;

    public void start() {
        System.out.println("欢迎使用学生管理系统！");
        while (true) {
            System.out.print("""
                    ====主菜单====
                    1.添加学生
                    2.显示学生列表
                    3.查询学生信息
                    4.添加/修改成绩
                    5.删除学生
                    6.删除学生成绩
                    7.退出系统
                    请输入你的选择：""");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            switch (choice) {
                case "1" -> addStudent(sc);
                case "2" -> printStudentList();
                case "3" -> queryStudents(sc);
                case "4" -> editStudentScore(sc);
                case "5" -> deleteStudent(sc);
                case "6" -> deleteStudentScore(sc);
                case "7" -> {
                    System.out.println("退出系统成功！");
                    return;
                }
                default -> System.out.println("输入错误！请重新输入！");
            }
        }
    }

    private void deleteStudentScore(Scanner sc) {
        if (checkStudentIsEmpty()) return;
        System.out.println("请输入要删除成绩的学号：");
        int id = sc.nextInt();
        Student student = searchStudent(id);
        if (student != null) {
            student.getScores().forEach((k, v) -> System.out.println(k + "：" + v));
            System.out.println("请输入要删除的课程：");
            String course = sc.next();
            if (student.getScores().containsKey(course)) {
                System.out.println("已删除" + student.getScores().remove(course));
            } else System.out.println("该学生没有该课程！");
        } else System.out.println("未找到该学生！");
    }

    private void deleteStudent(Scanner sc) {
        if (checkStudentIsEmpty()) return;
        System.out.println("请输入要删除的学号：");
        int id = sc.nextInt();
        Student student = searchStudent(id);
        if (student != null) {
            System.out.println("确定要删除该学生吗？(Y/N)");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("y")) {
                studentList.remove(student);
                System.out.println("删除成功！");
            } else System.out.println("取消删除！");
        } else System.out.println("未找到该学生！");
    }

    private void editStudentScore(Scanner sc) {
        if (checkStudentIsEmpty()) return;
        System.out.println("请输入要修改的学号：");
        int id = sc.nextInt();
        sc.nextLine();
        Student student = searchStudent(id);
        if (student != null) {
            System.out.println("请输入要修改/添加的课程：");
            String course = sc.nextLine();
            while (true) {
                System.out.println("请输入分数：");
                double score = sc.nextDouble();
                if (score >= 0 && score <= 100) {
                    setScores(student, course, score);
                    System.out.println("操作成功！");
                    return;
                } else {
                    System.out.println("分数必须在0-100之间！请重新输入！");
                    sc.nextLine();
                }
            }

        } else System.out.println("未找到该学生！");

    }

    private void queryStudents(Scanner sc) {
        if (checkStudentIsEmpty()) return;
        System.out.println("请输入要查询的学号：");
        int id = sc.nextInt();
        Student student = searchStudent(id);
        System.out.println("学生信息如下：");
        if (student != null) {
            System.out.println("学号：" + student.getId() + " 姓名：" + student.getName());
            if (student.getScores().isEmpty()) {
                System.out.println("暂无成绩！");
            } else student.getScores().forEach((k, v) -> System.out.println(k + "：" + v));
        } else System.out.println("未找到该学生！");
    }

    private void printStudentList() {
        if (checkStudentIsEmpty()) return;
        System.out.println("===学生列表===");
        for (Student student : studentList) {
            System.out.println("ID：" + student.getId() + " 姓名：" + student.getName());
        }
    }

    private void addStudent(Scanner sc) {
        Student student = new Student();
        System.out.println("===录入学生信息===");
        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();
        student.setName(name);
        student.setId(++id);
        studentList.add(student);
        System.out.println("学生信息已录入成功!\n" +
                "姓名：" + student.getName() + "\n学号（自动生成）：" + student.getId());
    }

    private Boolean checkStudentIsEmpty() {
        if (studentList.isEmpty()) {
            System.out.println("暂无数据！请先添加学生！");
            return true;
        }
        return false;
    }

    private Student searchStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    private void setScores(Student student, String course, double score) {
        Map<String, Double> scores = student.getScores();
        scores.put(course, score);
        student.setScores(scores);
    }
}
