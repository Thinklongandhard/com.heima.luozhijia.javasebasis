package com.luozhijia.javasebasis.day09ArrayList.Demo04StudentArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 16:57
 */
public class Student {
    private int age;
    private String name;
    public Student(){

    }
    public Student(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
