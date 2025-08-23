package com.zh8888.Java_Case.Student;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private Map<String, Double> scores = new HashMap<>();

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }

    public Student(int id, String name, Map<String, Double> scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }
}
