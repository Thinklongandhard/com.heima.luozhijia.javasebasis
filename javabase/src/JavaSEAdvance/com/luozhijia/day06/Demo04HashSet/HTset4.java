package JavaSEAdvance.com.luozhijia.day06.Demo04HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @anthor longway
 * @create 2022-06-17
 * 12:07
 */
public class HTset4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4(18,"小红");
        Student4 s2 = new Student4(18,"小bai");
        Student4 s3 = new Student4(18,"小明");

        Student4 s5 = new Student4(18,"小明");

        //创建HashSet对象
        HashSet<Student4> s = new HashSet<Student4>();

        //存储元素
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s5);

        //遍历
        //增强for
        for(Student4 s4 : s){
            System.out.println(s4.getName() + s4.getAge() + "岁");
        }
        System.out.println("-------------");
        //Iterator
        Iterator<Student4> it = s.iterator();
        while (it.hasNext()){
            Student4 next = it.next();
            System.out.println(next.getName() + next.getAge() + "岁");
        }
    }

}
