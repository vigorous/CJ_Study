package com.cj.study.test;

import com.cj.study.reflect.vo.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 自定义Class类模板
 *
 * @Author chenjun
 * @Date 2016/12/9
 */
public class ReflectTest {

    /**
     * 利用java的反射机制初始化某一个Bean
     * @return
     * @throws Throwable
     */
    public static Student initByDefaultConst() throws Throwable{

        //1.通过类装载器获取Student类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.cj.study.reflect.vo.Student");

        //2.获取类的默认构造器对象并通过它实例化Student
        Constructor cons = clazz.getConstructor();
        Student student = (Student)cons.newInstance();

        //3.通过反射方法设置属性
        Method setStuNo = clazz.getMethod("setStuNo",String.class);
        setStuNo.invoke(student,"081842182");

        Method setStuName = clazz.getMethod("setStuName",String.class);
        setStuName.invoke(student,"chenjun");

        Method setAge = clazz.getMethod("setAge",int.class);
        setAge.invoke(student,20);

        Method setDesc = clazz.getMethod("setDesc",String.class);
        setDesc.invoke(student,"安徽工业大学的学生");

        return student;
    }

    public static void main(String[] args) throws Throwable{
        Student student = initByDefaultConst();
        System.out.println(student.toString());
    }
}
