package com.luozhijia.javasebasis.day09ArrayList.Demo04StudentArrayList;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-09
 * 16:59
 */
//集合泛型为Student，将所有大于18岁的拿出来
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",21);
        Student s2 = new Student("李四",15);
        Student s3 = new Student("王五",20);
        Student s4 = new Student("马六",18);
        Student s5 = new Student("七八",17);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //遍历
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= 18){
            }else{
                list.remove(list.get(i));
            }

        }
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName() + temp.getAge());
        }
    }
}
