package com.zh8888.Java_oop.Interface.PeopleManager;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClassManager {
    private final ArrayList<Student> studentArrayList = new ArrayList<>();
    private final ArrayList<Teacher> teacherArrayList = new ArrayList<>();

    private int studentId = 202510000;
    private int teacherId = 202520000;

    private final Impl_A impl_a = new Impl_A();
    private final Impl_B impl_b = new Impl_B();

    {
        studentArrayList.add(new Student(++studentId, "张三", '男', 20, 80, 70, 90));
        studentArrayList.add(new Student(++studentId, "李一", '女', 19, 85, 75, 95));
        studentArrayList.add(new Student(++studentId, "王二", '男', 21, 90, 80, 88));
        studentArrayList.add(new Student(++studentId, "赵六", '女', 20, 78, 82, 93));
        studentArrayList.add(new Student(++studentId, "孙七", '男', 19, 87, 76, 91));
        studentArrayList.add(new Student(++studentId, "周八", '女', 20, 83, 79, 94));
        studentArrayList.add(new Student(++studentId, "吴九", '男', 22, 89, 81, 92));
        studentArrayList.add(new Student(++studentId, "郑十", '女', 21, 76, 84, 90));
        studentArrayList.add(new Student(++studentId, "冯十一", '男', 20, 82, 77, 93));
        studentArrayList.add(new Student(++studentId, "陈十二", '女', 19, 86, 83, 95));
        teacherArrayList.add(new Teacher(++teacherId, "张四", '男', "数学", 27));
        teacherArrayList.add(new Teacher(++teacherId, "李五", '女', "英语", 30));
        teacherArrayList.add(new Teacher(++teacherId, "王老六", '男', "语文", 35));
    }

    /**
     * 启动学校信息管理系统的主方法。
     * 该方法提供一个基于控制台的菜单界面，允许用户选择不同的操作来管理学生和教师的信息。
     * 方法通过Scanner获取用户输入，并根据用户的输入执行相应的操作。
     * 无参数
     * 无返回值
     */
    public void start() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("====学校信息管理系统====");
                // 显示操作菜单
                System.out.println("1.添加学生/教师\n2.打印学生/教师信息\n3.删除学生/教师信息\n4.修改学生/教室信息\n5.退出");
                System.out.print("请输入你的选择：");
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        addInfo(sc);
                        break;
                    case "2":
                        printInfo(sc);
                        break;
                    case "3":
                        deleteInfo(sc);
                        sc.nextLine();
                        break;
                    case "4":
                        editInfo(sc);
                        sc.nextLine();
                        break;
                    case "5":
                        System.out.println("已退出系统！");
                        return;
                    default:
                        System.out.println("输入有误，请重新输入！");
                        break;
                }
            }
        }
    }

    /**
     * 修改指定ID的学生或教师信息，包含字段验证和类型判断
     *
     * @param sc 用于接收用户输入的扫描器
     *           处理逻辑：
     *           1. 根据ID查找目标对象
     *           2. 判断对象类型（学生/教师）
     *           3. 根据类型展示不同的修改选项
     *           4. 执行字段修改并进行输入验证
     */
    private void editInfo(Scanner sc) {
        // 获取修改目标ID
        int inputId = inputIdCheck(sc, "修改");
        if (inputId == 0) return;

        // 查找目标对象并处理类型转换
        People result = search(inputId);
        if (result != null) {
            // 处理学生信息修改分支
            if (result instanceof Student studentResult) {
                // 展示修改前信息
                System.out.println("修改前：" + studentResult);
                // 展示修改选项
                System.out.println("请选择要修改的类型 1.姓名 2.性别 3.年龄 4.语文成绩 5.数学成绩 6.英语成绩 7.退出");
                System.out.print("请输入你的选择：");
                // 学生字段修改选择处理
                String choice5 = sc.nextLine();
                switch (choice5) {
                    case "1":
                        // 修改姓名字段
                        editName(studentResult, sc);
                        break;
                    case "2":
                        // 性别字段验证修改
                        editSex(studentResult, sc);
                        break;
                    case "3":
                        // 年龄字段范围验证
                        editAge(studentResult, sc);
                        break;
                    case "4":
                        // 语文成绩字段范围验证
                        inputScore(studentResult, sc, "语文");
                        break;
                    case "5":
                        // 数学成绩字段范围验证
                        inputScore(studentResult, sc, "数学");
                        break;
                    case "6":
                        // 英语成绩字段范围验证
                        inputScore(studentResult, sc, "英语");
                        break;
                    case "7":
                        System.out.println("已退出修改！");
                        return;
                    default:
                        System.out.println("输入有误，请重新输入！");
                }
            } else if (result instanceof Teacher teacherResult) {
                // 处理教师信息修改分支
                System.out.println("修改前：" + teacherResult);
                // 展示修改选项
                System.out.println("请选择要修改的类型 1.姓名 2.性别 3.年龄 4.科目");
                System.out.print("请输入你的选择：");
                // 教师字段修改选择处理
                String choice6 = sc.nextLine();
                switch (choice6) {
                    case "1":
                        // 修改姓名字段
                        editName(teacherResult, sc);
                        break;
                    case "2":
                        // 性别字段验证修改
                        editSex(teacherResult, sc);
                        break;
                    case "3":
                        // 年龄字段范围验证
                        editAge(teacherResult, sc);
                        break;
                    case "4":
                        // 科目字段有效性验证
                        while (true) {
                            System.out.print("请输入新的科目：");
                            teacherResult.setSubjects(sc.nextLine());
                            if (teacherResult.getSubjects().equals("语文") || teacherResult.getSubjects().equals("数学") || teacherResult.getSubjects().equals("英语")) {
                                break;
                            } else {
                                System.out.println("请输入正确的科目！");
                            }
                        }
                        break;
                    default:
                        System.out.println("输入有误，请重新输入！");
                }
            }
        } else System.out.println("输入有误，请重新输入！");
    }

    /*
     * 输入并更新学生指定科目的成绩
     * @param studentResult 需要更新成绩的学生对象
     * @param sc 用于接收用户输入的扫描器
     * @param subjects 需要更新的科目名称（支持语文/数学/英语）
     * 该方法会持续接收输入直到获得有效成绩（0-100之间），
     * 并根据科目类型更新对应的成绩字段
     */
    private void inputScore(Student studentResult, Scanner sc, String subjects) {
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
                        studentResult.setChinese(score);
                        break;
                    case "数学":
                        studentResult.setMath(score);
                        break;
                    case "英语":
                        studentResult.setEnglish(score);
                        break;
                }
                // 显示更新成功提示
                System.out.println("已将" + studentResult.getName() + "的" + subjects + "修改为" + score);
                return;
            } else System.out.println("请输入正确的成绩！");
        }
    }

    private void editAge(People result, Scanner sc) {
        while (true) {
            try {
                System.out.print("请输入年龄：");
                result.setAge(sc.nextInt());
                if (result.getAge() >= 0 && result.getAge() <= 120) {
                    break;
                } else {
                    System.out.println("请输入正确的年龄！");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("请输入正确的年龄！");
                sc.next();
            }
        }
    }

    private void editSex(People result, Scanner sc) {
        while (true) {
            System.out.print("请输入新的性别：");
            result.setSex(sc.nextLine().charAt(0));
            if (result.getSex() == '男' || result.getSex() == '女') {
                break;
            } else {
                System.out.println("请输入正确的性别！");
            }
        }
    }

    private void editName(People result, Scanner sc) {
        System.out.print("请输入新的姓名：");
        result.setName(sc.nextLine());
    }

    /**
     * 删除人员信息的方法
     *
     * @param sc Scanner对象，用于获取用户输入的学号/教师编号
     *           无返回值，但会修改studentArrayList或teacherArrayList的内容
     */
    private void deleteInfo(Scanner sc) {
        // 处理用户输入
        int inputId = inputIdCheck(sc, "删除");
        if (inputId == 0) return;
        // 执行查找操作
        People result = search(inputId);
        // 处理查找结果
        if (result != null) {
            // 区分学生和教师类型进行删除
            if (result instanceof Student studentResult) {
                // 执行学生信息删除操作
                if (studentArrayList.remove(studentResult)) System.out.println("删除成功！");
                else System.out.println("删除失败！");
            } else if (result instanceof Teacher teacherResult) {
                // 执行教师信息删除操作
                if (teacherArrayList.remove(teacherResult)) System.out.println("删除成功！");
                else System.out.println("删除失败！");
            }
        } else System.out.println("未找到此人，请重新输入！");
    }

    private int inputIdCheck(Scanner sc, String operation) {
        int inputId;
        while (true) {
            try {
                System.out.println("请输入要" + operation + "的学号/教师编号(输入0退出)");
                inputId = sc.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("请输入正确的学号/教师编号！");
                sc.next();
                continue;
            }
            if (inputId == 0) {
                System.out.println("已退出" + operation + "操作！");
                return 0;
            }
            if (inputId > 202510000 && inputId < 202510000 + studentArrayList.size()
                    || inputId > 20252000 && inputId < 20252000 + teacherArrayList.size()) {
                break;
            } else {
                System.out.println("不在学号/教师范围内！(学生范围：202510001~202519999 教师范围：20252001~20252999)");
//                continue;
            }
        }
        return inputId;
    }

    /**
     * 打印信息方法
     * 功能：根据用户输入选择打印学生或教师信息列表
     * 参数：
     *
     * @param sc Scanner对象用于接收用户输入
     *           返回值：void
     *           内部逻辑：
     *           1. 提示用户选择打印类型
     *           2. 读取用户输入选择
     *           3. 根据选择调用对应的打印实现
     */
    private void printInfo(Scanner sc) {
        // 打印类型选择提示
        System.out.println("请选择要打印的类型 1.学生 2.教师");
        System.out.print("请输入你的选择：");

        // 读取用户输入选择
        String choice2 = sc.nextLine();

        /*
         * 根据用户选择执行对应打印操作
         * 1: 打印学生列表
         * 2: 打印教师列表
         */
        if (Objects.equals(choice2, "1")) impl_a.print(studentArrayList);
        else if (Objects.equals(choice2, "2")) impl_b.print(teacherArrayList);
    }

    /**
     * 添加人员信息的方法
     *
     * @param sc Scanner对象用于接收用户输入的选择类型
     *           无返回值，但会修改studentArrayList或teacherArrayList的内容
     *           处理逻辑：
     *           1. 提示用户选择添加类型
     *           2. 根据选择创建对应对象
     *           3. 调用实现类方法完成添加
     */
    private void addInfo(Scanner sc) {
        System.out.println("请选择要添加的类型 1.学生 2.教师 3.退出");
        System.out.print("请输入你的选择：");
        String choice1 = sc.nextLine();
        int maxStudentId = 202519999;
        if (studentId == maxStudentId) {
            System.out.println("学生人数已满，无法添加！");
            return;
        }
        int maxTeacherId = 202521000;
        if (teacherId == maxTeacherId) {
            System.out.println("教师人数已满，无法添加！");
            return;
        }
        if (Objects.equals(choice1, "1")) studentArrayList.add(impl_a.add(new Student(++studentId)));
        else if (Objects.equals(choice1, "2")) teacherArrayList.add(impl_b.add(new Teacher(++teacherId)));
        else if (Objects.equals(choice1, "3")) System.out.println("已退出添加功能！");
        else System.out.println("输入有误，请重新输入！");
    }

    /**
     * 根据ID查找人员信息
     *
     * @param id 要查找的人员唯一标识
     * @return 找到的People对象（Student或Teacher），未找到返回null
     * 查找逻辑：
     * 1. 遍历学生列表查找匹配ID
     * 2. 遍历教师列表查找匹配ID
     * 3. 返回找到的第一个匹配项
     */
    private People search(int id) {
        for (Student student : studentArrayList) {
            if (Objects.equals(student.getStudentId(), id)) {
                System.out.println(student);
                return student;
            }
        }
        for (Teacher teacher : teacherArrayList) {
            if (Objects.equals(teacher.getTeacherId(), id)) {
                System.out.println(teacher);
                return teacher;
            }
        }
        return null;
    }
}
