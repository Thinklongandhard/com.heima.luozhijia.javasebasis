package JavaSEAdvance.com.luozhijia.day05.CollectionDemo4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @anthor longway
 * @create 2022-06-16
 * 15:52
 */
//需求：
    //创建一个存储学生对象的集合，存储三个对象，
    //输出在控制台
public class CollectionTest {
    public void show(Student[] s){
        //创建集合
        Collection<Student> c = new ArrayList<Student>();
        //存储对象
        for (int i = 0; i < s.length; i++) {
            c.add(s[i]);
        }
        //遍历对象
        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student s1 = it.next();
            System.out.println(s1.getName() + s1.getAge() + "岁了");
        }
    }
}
