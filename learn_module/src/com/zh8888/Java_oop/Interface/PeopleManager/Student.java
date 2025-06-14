package com.zh8888.Java_oop.Interface.PeopleManager;

public class Student extends People {
    private int studentId;
    private double chinese;
    private double math;
    private double english;
    private double totalScore;

    public Student() {
    }

    public Student(int studentId, String name, char sex, int age, int chinese, int math, int english) {
        super(name, sex, age);
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.studentId = studentId;
        this.totalScore = chinese + math + english;
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
        updateScore();
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
        updateScore();
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
        updateScore();
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
    public void updateScore() {
        this.totalScore = this.chinese + this.math + this.english;
    }

    @Override
    public String toString() {
        return "学生{" +
                "学号：" + studentId +
                ",姓名：" + super.getName() +
                ",性别：" + super.getSex() +
                ",年龄：" + super.getAge() +
                ",语文：" + chinese +
                ",数学：" + math +
                ",英语：" + english +
                ",总分：" + totalScore +
                '}';
    }
}
