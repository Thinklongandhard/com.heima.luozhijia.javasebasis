package com.luozhijia.javasebasis.day07Oop.Object01;

/**
 * @anthor longway
 * @create 2022-06-05
 * 14:44
 */
public class Student {
    //属性：姓名，年龄
    public String name;
    public int age;

    //行为：学习
    public void study(String name,int age){
        System.out.println("名字叫：" + name + ",年龄为：" + age);
        System.out.println("学习");
    }
}
