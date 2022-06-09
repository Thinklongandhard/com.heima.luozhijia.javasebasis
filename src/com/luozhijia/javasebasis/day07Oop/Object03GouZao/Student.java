package com.luozhijia.javasebasis.day07Oop.Object03GouZao;

/**
 * @anthor longway
 * @create 2022-06-05
 * 17:46
 */
public class Student {
    private int age;
    private String name;
    //构造方法
    public Student(int age,String name){
        this.name = name;
        this.age = age;
        System.out.println("Student的构造方法");
    }
    public void point(){
        System.out.println("年龄：" + age + ",姓名：" + name);
    }
}
