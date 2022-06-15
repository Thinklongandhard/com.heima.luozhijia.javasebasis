package JavaSEAdvance.com.luozhijia.day02.Demo04Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:49
 */
public class Animale {
    private int age;
    private String name;

    public Animale() {
    }

    public Animale(int age, String name) {
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

    public void eat(){
        System.out.println("吃东西");
    }
    public void durk(){
        System.out.println("喝水");
    }
}
