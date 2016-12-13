package com.cj.study.test;

import com.cj.study.reflect.vo.Student;

/**
 * Created by haopai-02 on 2016/12/9.
 */
public class TestClass {

    public static void main(String[] args) throws Exception{

        Student student = new Student();
        /**
         * 获取Class对象的方式有三种：
         *
         * 1.使用类的字面常量
         * 2.使用Class.forName()函数
         * 3.使用getClass()函数
         */
        Class c1 = Student.class;

        Class c2 = Class.forName("com.cj.study.reflect.vo.Student");

        Class c3 = student.getClass();

        System.out.println("c1 = "+c1+",c2 = "+c2+",c3 = "+c3);
    }
}
