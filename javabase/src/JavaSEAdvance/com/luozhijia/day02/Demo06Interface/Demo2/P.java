package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 13:58
 */
public class P extends learn implements English{
    public P() {
    }

    public P(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }

    @Override
    public void study() {
        System.out.println("打乒乓");
    }

    @Override
    public void English() {
        System.out.println("学员学英语");
    }
}
