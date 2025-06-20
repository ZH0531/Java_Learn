package com.zh8888.Java_oop.Interface.PeopleManager;

public class People {
    private String name;
    private char sex;
    private int age;

    public People() {
    }

    public People(String name, char sex, int age) {
        this.name = name + " \t";
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + " \t";
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}