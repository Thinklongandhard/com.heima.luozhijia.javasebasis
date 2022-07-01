package JavaSEAdvance.com.luozhijia.day15.Demo1;

/**
 * @anthor longway
 * @create 2022-06-28
 * 21:30
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    private Student (String name,int age) {this.name = name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
