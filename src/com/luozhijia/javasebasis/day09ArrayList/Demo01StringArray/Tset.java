package com.luozhijia.javasebasis.day09ArrayList.Demo01StringArray;

/**
 * @anthor longway
 * @create 2022-06-09
 * 15:48
 */
public class Tset {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student("张三",20);
        Student stu2 = new Student("李四",21);
        Student stu3 = new Student("王五",22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //拿到对象中的数据
        for (int i = 0; i < arr.length; i++) {
            Student tmep = arr[i];
            System.out.println(tmep.getName() + tmep.getAge());
        }
    }
}
