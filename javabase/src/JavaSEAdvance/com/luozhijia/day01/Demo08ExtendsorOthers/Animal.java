package JavaSEAdvance.com.luozhijia.day01.Demo08ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:30
 */
public class Animal {
    private String name;
    private int age;


    public Animal() {
    }
    public Animal(String name, int age) {
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
