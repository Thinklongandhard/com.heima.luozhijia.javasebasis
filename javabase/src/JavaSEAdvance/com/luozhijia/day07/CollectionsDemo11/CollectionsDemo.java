package JavaSEAdvance.com.luozhijia.day07.CollectionsDemo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @anthor longway
 * @create 2022-06-18
 * 18:17
 */
/*
 需求：
    ArrayList存储学生对象，使用Collections对ArrayList进行排序
    按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序

    分析：
       创建ArrayList集合，
       创建学生对象
       存储学生对象
       使用Collections对集合排序
       遍历ArrayList集合

 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student(18,"xiang");
        Student s2 = new Student(20,"ang");
        Student s3 = new Student(15,"iang");
        Student s4 = new Student(15,"aang");
        //创建ArrayList集合，
        ArrayList<Student> al = new ArrayList<Student>();
        //存储
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        //用Collections对集合排序
        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //遍历集合
        for (int i = 0; i < al.size(); i++) {
            Student student = al.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }

    }
}
