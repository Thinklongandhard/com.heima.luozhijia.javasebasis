package com.luozhijia.javasebasis.day09ArrayList.Demo01StringArray;

/**
 * @anthor longway
 * @create 2022-06-09
 * 15:38
 */
//需求：三个对象存入数组，然后遍历数组
public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
