package com.luozhijia.javasebasis.day09ArrayList.Demo05Test;

/**
 * @anthor longway
 * @create 2022-06-09
 * 17:21
 */
public class StudentData {
    //学生姓名，学号，年龄
    private String name;
    private String pass;
    private int age;
    public StudentData(){

    }
    public StudentData(String name,String pass,int age){
        this.name = name;
        this.pass = pass;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
