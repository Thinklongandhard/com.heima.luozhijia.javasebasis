package JavaSEAdvance.com.luozhijia.day07.MapDemo6Test;

import java.util.HashMap;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-18
 * 14:00
 */
//遍历学生对象
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
        Student s1 = new Student(2019,"llll");
        Student s2 = new Student(2000,"zzzz");
        Student s3 = new Student(2022,"bbbb");

        //存储学生对象
        hm.put(s1.getNum(),s1);
        hm.put(s2.getNum(),s2);
        hm.put(s3.getNum(),s3);

        //遍历1
        //拿到所有键值对
//        Set<Map.Entry<Integer, Student>> entrySet = hm.entrySet();
//        //遍历所有键值对
//        for(Map.Entry<Integer, Student> me : entrySet){
//            Integer key = me.getKey();
//            String name = me.getValue().getName();
//            System.out.println(name + "," + key);
//        }
        //方法2
        //获取所有的键
        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet){
            Student student = hm.get(key);
            System.out.println(student.getName() + "," + student.getNum());
        }

    }
}
