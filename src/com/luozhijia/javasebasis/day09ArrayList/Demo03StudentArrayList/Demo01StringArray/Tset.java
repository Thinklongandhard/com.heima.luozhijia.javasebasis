package com.luozhijia.javasebasis.day09ArrayList.Demo03StudentArrayList.Demo01StringArray;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 15:48
 */
public class Tset {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhang",1);
        Student s2 = new Student("zhang",1);
        Student s3 = new Student("zhang",1);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName() + temp.getAge());
        }
    }
}
