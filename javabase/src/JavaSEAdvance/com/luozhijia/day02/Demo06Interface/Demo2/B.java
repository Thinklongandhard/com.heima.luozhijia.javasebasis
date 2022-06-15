package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 13:57
 */
public class B extends learn {
    public B() {
    }

    public B(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void study() {
        System.out.println("打篮球");
    }
}
