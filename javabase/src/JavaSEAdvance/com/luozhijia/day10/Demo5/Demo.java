package JavaSEAdvance.com.luozhijia.day10.Demo5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @anthor longway
 * @create 2022-06-22
 * 11:48
 */
public class Demo {
    public static void main(String[] args) {
        try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo5/IO.txt"));
        ) {
            //创建对象
            Student s = new Student("林xx",80);
            //传入
            oo.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
