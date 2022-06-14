package JavaSEAdvance.com.luozhijia.day01.Demo08ExtendsorOthers;

/**
 * @anthor longway
 * @create 2022-06-14
 * 17:37
 */
public class DemoTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(10);
        cat.setName("小白");
        cat.push();

        Short s = new Short("小黑",5);
        s.run();
    }
}
