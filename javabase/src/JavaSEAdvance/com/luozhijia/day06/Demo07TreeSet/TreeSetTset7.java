package JavaSEAdvance.com.luozhijia.day06.Demo07TreeSet;

import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 15:31
 */
public class TreeSetTset7 {
    public static void main(String[] args) {
        //创建对象
        Student7 s1 = new Student7(18,"xiao");
        Student7 s2 = new Student7(10,"da");
        Student7 s3 = new Student7(22,"hei");
        Student7 s4 = new Student7(10,"aaa");
        //创建TreeSet集合
        TreeSet<Student7> ts = new TreeSet<Student7>();
        //存入集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        //循环判断
        for (Student7 s : ts){
            System.out.println(s.getName() + s.getAge());
        }
    }
}
