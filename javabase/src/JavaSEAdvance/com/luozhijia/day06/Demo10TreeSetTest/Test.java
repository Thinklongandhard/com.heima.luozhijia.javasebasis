package JavaSEAdvance.com.luozhijia.day06.Demo10TreeSetTest;

import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 17:48
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student(90,50,"liu");
        Student s2 = new Student(88,99,"mmm");
        Student s3 = new Student(77,56,"ccc");
        Student s4 = new Student(56,78,"aa");
        Student s5 = new Student(99,50,"xxx");
        Student s6 = new Student(50,99,"xxx");
        Student s7 = new Student(50,99,"aaa");
        //创建TreeSet()集合
        TreeSet<Student> ts = new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历
        for(Student s : ts){
            System.out.println("语文" + s.getChinese() + "，数学" + s.getMath() + "，姓名：" + s.getName());
        }

    }
}
