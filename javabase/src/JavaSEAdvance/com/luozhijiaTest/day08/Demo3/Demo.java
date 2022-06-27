package JavaSEAdvance.com.luozhijiaTest.day08.Demo3;

import java.util.HashSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:28
 */
/*
	定义一个存储Student类型的HashSet集合
	创建以下三个Student对象
张三,男,20
李四,女,21
张三,男,20
	将上述三个对象存储到Set集合中
	使用增强for遍历集合，获取每个Student对象，并打印属性值；
	请实现集合中不能存储姓名年龄相同的元素
    //实现方法：   在Student类中重写equals方法和hashCode方法

 */
public class Demo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        Student s1 = new Student("张三","男",20);
        Student s2 = new Student("李四","女",21);
        Student s3 = new Student("张三","男",20);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        for (Student s : hs){
            System.out.println(s.getName() + "," + s.getSex() + "," + s.getAge());
        }
    }
}
