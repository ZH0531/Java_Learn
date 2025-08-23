package com.zh8888.Java_Stream;

import java.util.*;
import java.util.stream.*;

/**
 * Java Stream API 综合练习：过滤、映射、排序、聚合与挑战任务示例。
 * <p>
 * 练习内容：
 * <ul>
 *   <li>按条件过滤</li>
 *   <li>属性映射</li>
 *   <li>按年龄排序</li>
 *   <li>统计数字列表信息</li>
 *   <li>计算学生平均分</li>
 *   <li>挑战：所有科目>85分</li>
 * </ul>
 */
public class StreamDemo {
    public static void main(String[] args) {
        // 1. 创建测试数据
        List<Student> students = Arrays.asList(
                new Student("王小明", 18, Arrays.asList(85, 92, 78)),
                new Student("李华", 19, Arrays.asList(90, 88, 95)),
                new Student("张三", 20, Arrays.asList(76, 82, 79)),
                new Student("赵灵儿", 18, Arrays.asList(95, 97, 99)),
                new Student("林月如", 19, Arrays.asList(88, 85, 90))
        );

        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        System.out.println("原始数据:");
        System.out.println("学生列表: " + students);
        System.out.println("数字列表: " + numbers);
        System.out.println("\n====== Stream操作练习 ======\n");

        // 2. 任务1：过滤操作
        System.out.println("任务1: 过滤出年龄>18的学生");
        // TODO 1: 添加过滤条件（年龄大于18）
        List<Student> list = students.stream().filter(student -> student.getAge() > 18).toList();
        System.out.println("结果: " + list);

        // 3. 任务2：映射操作
        System.out.println("\n任务2: 获取所有学生的姓名列表");
        // TODO 2: 将Student对象映射为姓名
        List<String> list1 = students.stream().map(Student::getName).toList();
        System.out.println("结果: " + list1);

        // 4. 任务3：排序操作
        System.out.println("\n任务3: 对学生按年龄升序排序");
        // TODO 3: 添加排序条件（按年龄升序）
        List<Student> list2 = students.stream().sorted(Comparator.comparingInt(Student::getAge)).toList();
        System.out.println("结果: " + list2);

        // 5. 任务4：聚合操作
        System.out.println("\n任务4: 计算数字列表的统计信息");
        IntSummaryStatistics stats = numbers.stream()
                // TODO 4: 将流转换为IntStream
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("统计结果: 平均=" + stats.getAverage() +
                ", 最大=" + stats.getMax() +
                ", 最小=" + stats.getMin() +
                ", 总和=" + stats.getSum());

        // 6. 任务5：复杂操作 - 计算每个学生的平均分
        System.out.println("\n任务5: 计算每个学生的平均分");
        Map<String, Double> avgScores = students.stream()
                // TODO 5: 创建学生姓名到平均分的映射
                .collect(Collectors.toMap(
                        Student::getName,
                        student -> student.getScores().stream()
                                .mapToDouble(Integer::intValue)
                                // TODO 5.1: 计算平均分
                                .average()
//                                 TODO 5.2: 处理可能为空的情况
                                .orElse(0.0)
                ));
        System.out.println("学生平均分: " + avgScores);

        // 7. 挑战任务：找出所有科目都超过85分的学生
        System.out.println("\n挑战任务: 全优学生（所有科目>85分）");
        List<Student> excellentStudents = students.stream()
                // TODO 挑战: 添加过滤条件（所有分数都大于85）
                .collect(Collectors.toList());
        System.out.println("全优学生: " + excellentStudents);
    }
}

