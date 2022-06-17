package JavaSEAdvance.com.luozhijia.day06.Demo08TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 16:28
 */
public class TreeSetDemo8 {
    public static void main(String[] args) {
        //创建对象
        TreeSet<Student8> ts = new TreeSet<Student8>(new Comparator<Student8>() {
            @Override
            public int compare(Student8 o1, Student8 o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num==0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        //创建Student对象
        Student8 s1 = new Student8(18,"xiao");
        Student8 s2 = new Student8(10,"da");
        Student8 s3 = new Student8(22,"hei");
        Student8 s4 = new Student8(10,"aaa");
        //存入集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        //遍历
        for(Student8 s : ts){
            System.out.println(s.getName() + s.getAge());
        }

    }
}
