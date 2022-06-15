package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo4Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 10:56
 */
public abstract class Animale {
    private int age = 0;
    private String name = "";

    public Animale() {
    }

    public Animale(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void show(){
        System.out.println(getAge() + "岁,叫" + getName());
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
