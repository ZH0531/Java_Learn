package com.zh8888.Java_oop.Interface.PeopleManager;

public class Teacher extends People {
    private String subjects;
    public int teacherId;

    public Teacher() {
    }

    public Teacher(int TEACHER_ID, String name, char sex, String subjects, int age) {
        super(name, sex, age);
        this.subjects = subjects;
        this.teacherId = TEACHER_ID;
    }

    public Teacher(int TEACHER_ID) {
        this.teacherId = TEACHER_ID;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "教师{" +
                "教师编号：" + teacherId +
                ",姓名：" + super.getName() +
                ",性别：" + super.getSex() +
                ",年龄：" + super.getAge() +
                ",学科：" + subjects +
                '}';
    }
}

