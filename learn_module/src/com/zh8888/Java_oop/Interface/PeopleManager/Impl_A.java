package com.zh8888.Java_oop.Interface.PeopleManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生信息操作实现类A
 * 实现打印和添加学生信息的功能
 */
public class Impl_A implements Print<Student>, Add<Student> {

    /**
     * 打印学生信息列表并统计分析
     *
     * @param list 学生数据列表
     *             显示每个学生的详细信息及班级统计信息
     */
    @Override
    public void print(ArrayList<Student> list) {
        if (list.isEmpty()) {
            System.out.println("班级中没有学生，无法打印信息");
            return;
        }
        double totalChinese = 0.0;
        double totalMath = 0.0;
        double totalEnglish = 0.0;
        int boy = 0;
        int girl = 0;
        double totalScore = 0.0;
        System.out.println("========班级学生列表========");
        for (Student student : list) {
            System.out.println("学号：" + student.getStudentId() + " 姓名：" + student.getName() + " 性别：" + student.getSex() + " 年龄：" + student.getAge() + " 语文成绩：" + student.getChinese() + " 数学成绩：" + student.getMath() + " 英语成绩：" + student.getEnglish() + " 总成绩：" + student.getTotalScore());
            totalChinese += student.getChinese();
            totalMath += student.getMath();
            totalEnglish += student.getEnglish();

            if (student.getSex() == '男') {
                boy++;
            } else {
                girl++;
            }

            totalScore += student.getTotalScore();
        }
        System.out.println("男生人数：" + boy + "女生人数：" + girl);

        if (!list.isEmpty()) {
            double avgChinese = totalChinese / list.size();
            double avgMath = totalMath / list.size();
            double avgEnglish = totalEnglish / list.size();
            double avgTotal = totalScore / list.size();


            System.out.print("语文平均分为：" + String.format("%.2f", avgChinese));
            System.out.print(" 数学平均分为：" + String.format("%.2f", avgMath));
            System.out.print(" 英语平均分为：" + String.format("%.2f", avgEnglish));
            System.out.println(" 总分平均分为：" + String.format("%.2f", avgTotal));
        } else {
            System.out.println("班级中没有学生，无法计算平均分");
        }
        System.out.println("===========================");
    }

    /**
     * 添加新学生信息
     *
     * @param student 需要添加的学生对象
     * @return 添加成功的学生对象
     * 通过控制台输入收集学生详细信息
     */
    @Override
    public Student add(Student student) {
        System.out.println("========添加学生=========");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        student.setName(sc.next());
        while (true) {
            System.out.println("请输入学生性别：");
            student.setSex(sc.next().charAt(0));
            if (student.getSex() == '男' || student.getSex() == '女') {
                break;
            } else {
                System.out.println("请输入正确的性别！");
            }
        }
        while (true) {
            try {
                System.out.println("请输入学生年龄：");
                student.setAge(sc.nextInt());
                if (student.getAge() >= 0 && student.getAge() <= 120) {
                    break;
                } else {
                    System.out.println("请输入正确的年龄！");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("请输入正确的年龄！");
                sc.next();
            }
        }
        inputScore(student, sc, "语文");
        inputScore(student, sc, "数学");
        inputScore(student, sc, "英语");
        System.out.println("学生信息添加成功！");
        System.out.println("=======================");
        return student;
    }
    private void inputScore(Student student, Scanner sc, String subjects) {
        double score;
        // 持续接收输入直到获得有效成绩
        while (true) {
            try {
                // 提示输入并读取成绩
                System.out.print("请输入" + subjects + "成绩：");
                score = sc.nextDouble();
            } catch (java.util.InputMismatchException e) {
                // 处理非数字输入异常
                System.out.println("请输入正确的成绩！");
                sc.next();
                continue;
            }
            // 验证成绩有效性
            if (score >= 0 && score <= 100) {
                // 根据科目类型更新对应成绩字段
                switch (subjects) {
                    case "语文":
                        student.setChinese(score);
                        break;
                    case "数学":
                        student.setMath(score);
                        break;
                    case "英语":
                        student.setEnglish(score);
                        break;
                }
                return;
            } else System.out.println("请输入正确的成绩！");
        }
    }
}

