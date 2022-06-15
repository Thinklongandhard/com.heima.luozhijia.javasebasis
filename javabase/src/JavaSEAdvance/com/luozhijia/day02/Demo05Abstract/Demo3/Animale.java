package JavaSEAdvance.com.luozhijia.day02.Demo05Abstract.Demo3;

/**
 * @anthor longway
 * @create 2022-06-15
 * 10:36
 */
public abstract class Animale {
    private int age = 40;
    private final String path = "武汉";

    public Animale(){

    }
    public Animale(int age){
        this.age = age;
    }

    public void show(){
        //
        System.out.println(age);
        System.out.println(path);
    }
    public abstract void eat();
}
