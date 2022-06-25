package JavaSEAdvance.com.luozhijia.day10.Demo6;

import java.io.Serializable;

/**
 * @anthor longway
 * @create 2022-06-22
 * 12:32
 */
public class Student implements Serializable {
    //序列化版本号
    private static final long serialVersionUID = 16416513l;
    private String name;
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
