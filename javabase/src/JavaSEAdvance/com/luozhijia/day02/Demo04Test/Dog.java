package JavaSEAdvance.com.luozhijia.day02.Demo04Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:49
 */
public class Dog extends Animale {
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃屎");
    }

    @Override
    public void durk() {
        System.out.println("吃奶");
    }
    public void look(){
        System.out.println("看门");
    }
}
