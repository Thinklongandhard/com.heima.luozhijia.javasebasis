package JavaSEAdvance.com.luozhijia.day10.Demo1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 15:22
 */
public class Demo {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int i = (s2.getChinese() + s2.getEnglish() + s2.getMaths()) - (s1.getChinese() + s1.getEnglish() + s1.getMaths());
                int num = i == 0 ? s2.getChinese() - s1.getChinese() : i;
                int num2 = num == 0 ? s2.getMaths() - s2.getMaths() : num;
                int num3 = num2 == 0 ? s2.getName().compareTo(s1.getName()) : num2;
                return num3;
            }
        });
        Student s1 = new Student("lll",90,98,105);
        Student s2 = new Student("zzzz",88,90,100);
        Student s3 = new Student("ahsiodh",95,70,99);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        IOgo iOgo = new IOgo();
        iOgo.show(ts);
    }
}
