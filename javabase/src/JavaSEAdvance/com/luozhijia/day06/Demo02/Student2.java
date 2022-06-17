package JavaSEAdvance.com.luozhijia.day06.Demo02;

/**
 * @anthor longway
 * @create 2022-06-17
 * 10:37
 */
public class Student2 {
    private int age;
    private String name;

    public Student2() {
    }

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

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



    @Override
    public int hashCode() {
        return 0;
    }
}
