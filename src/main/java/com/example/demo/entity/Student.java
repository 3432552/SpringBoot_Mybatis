package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wzh
 * @ClassName: Student
 * @Description:
 * @Date: 2019/8/22 12:14
 */
public class Student implements Serializable{
    private static final long serialVersionUID = -4167201345017790222L;
    private Integer id;
    private String name;
    private String course;
    private Integer score;

    public Student(Integer id, String name, String course, Integer score) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", score=" + score +
                '}';
    }
}
