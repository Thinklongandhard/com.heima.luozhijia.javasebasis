package JavaSEAdvance.com.luozhijia.day02.Demo04Test;

/**
 * @anthor longway
 * @create 2022-06-15
 * 8:49
 */
public class Cat extends Animale{

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void durk() {
        System.out.println("喝牛奶");
    }
    public void play(){
        System.out.println("玩耍");
    }
}
