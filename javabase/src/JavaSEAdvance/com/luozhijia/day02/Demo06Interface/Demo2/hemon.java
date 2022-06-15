package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 13:46
 */
public abstract class hemon {
    private int age;
    private String name;

    public hemon() {
    }

    public hemon(int age, String name) {
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

    public abstract void eat();
}
