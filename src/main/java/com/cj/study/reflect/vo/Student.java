package com.cj.study.reflect.vo;

/**
 * Created by haopai-02 on 2016/12/9.
 */
public class Student {
    //学号
    private String stuNo;
    //学生姓名
    private String stuName;
    //年龄
    private int age;
    //描述
    private String desc;

    public Student() {
    }

    public Student(String stuNo, String stuName, int age, String desc) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.age = age;
        this.desc = desc;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStuNo() {
        return stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public int getAge() {
        return age;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
