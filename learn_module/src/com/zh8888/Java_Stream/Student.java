package com.zh8888.Java_Stream;

import java.util.List;

/**
 * 学生实体：包含姓名、年龄与各科成绩列表。
 */
class Student {
    private String name;
    private int age;
    private List<Integer> scores;

    public Student(String name, int age, List<Integer> scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    // Getter方法
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<Integer> getScores() { return scores; }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
