package JavaSEAdvance.com.luozhijia.day02.Demo06Interface.Demo2;

/**
 * @anthor longway
 * @create 2022-06-15
 * 14:02
 */
public class Bteach extends teach{
    public Bteach() {
    }

    public Bteach(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Bteach吃");
    }

    @Override
    public void teache() {
        System.out.println("交B打球");
    }
}
