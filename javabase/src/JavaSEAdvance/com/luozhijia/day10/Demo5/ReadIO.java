package JavaSEAdvance.com.luozhijia.day10.Demo5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @anthor longway
 * @create 2022-06-22
 * 12:02
 */
public class ReadIO {
    //反序列化
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo5/IO.txt"));
        ) {
            Object o = ois.readObject();
            Student s = (Student) o;
            System.out.println(s.getName() + "," + s.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
