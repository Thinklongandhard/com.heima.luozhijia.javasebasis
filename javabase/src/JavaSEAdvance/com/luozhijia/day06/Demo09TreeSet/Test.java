package JavaSEAdvance.com.luozhijia.day06.Demo09TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 16:59
 */
public class Test {
    public static void main(String[] args) {
        //创建Student对象
        Student9 s1 = new Student9("liu",90,86);
        Student9 s2 = new Student9("hua",50,86);
        Student9 s3 = new Student9("hon",98,68);
        Student9 s4 = new Student9("xxx",77,66);
        Student9 s5 = new Student9("aaa",88,99);

        //创建TreeSet集合
        TreeSet<Student9> ts = new TreeSet<Student9>(new Comparator<Student9>() {
            @Override
            public int compare(Student9 s1, Student9 s2) {
                //排序
                int num = s1.getNum() - s2.getNum();
                return num;
            }
        });
        //存入集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //遍历
        //增强for
        for(Student9 s : ts){
            System.out.println(s.getName() + ",数学: " + s.getShuxue() + ",语文：" + s.getYuwen());
        }
    }
}
