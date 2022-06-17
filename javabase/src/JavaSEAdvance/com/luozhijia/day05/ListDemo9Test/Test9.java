package JavaSEAdvance.com.luozhijia.day05.ListDemo9Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-17
 * 7:57
 */
//创建Student9对象
    //调方法输出
public class Test9 {
    public static void main(String[] args) {
        Student9 S = new Student9(18,"小明");
        Student9 s1 = new Student9();
        s1.setAge(20);
        s1.setName("小红");
        Student9 s2 = new Student9(21,"小兰");
        List<Student9> list = new ArrayList<Student9>();
        Student9[] s = new Student9[]{S,s1,s2};
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        //创建对象
        Student9 s3 = new Student9();
        ListDemo9 ld = new ListDemo9();
        ld.show(s3,list);
        System.out.println("-----------s");
        ld.show1(s3,list);
        System.out.println("-----------s2");
        ld.show2(s3,list);
        System.out.println("-----------s3");
        ld.show3(s3,list);
    }
}
