package JavaSEAdvance.com.luozhijia.day05.CollectionDemo4;

/**
 * @anthor longway
 * @create 2022-06-16
 * 15:54
 */
//学生类对象
public class Student {
    private String name;
    private int age;

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
}
