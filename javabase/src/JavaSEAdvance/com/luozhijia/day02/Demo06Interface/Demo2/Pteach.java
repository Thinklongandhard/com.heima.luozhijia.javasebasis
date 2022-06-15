package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 13:59
 */
public class Pteach extends teach implements English{
    public Pteach() {
    }

    public Pteach(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("P教练");
    }

    @Override
    public void teache() {
        System.out.println("交P打球");
    }

    @Override
    public void English() {
        System.out.println("教练学英语");
    }
}
