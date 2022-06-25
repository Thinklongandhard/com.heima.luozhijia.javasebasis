package JavaSEAdvance.com.luozhijia.day10.Demo6;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-22
 * 12:23
 */
public class Demo {
    public static void main(String[] args) {
        show();
        show1();
    }
    //反序列化
    public static void show1(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo6/java.txt"));
        ) {
            Object o = ois.readObject();
            Student s = (Student) o;
            System.out.println(s.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //序列化
    public static void show(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo6/java.txt"));
        ) {
            Student s = new Student("流",60);
            oos.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
