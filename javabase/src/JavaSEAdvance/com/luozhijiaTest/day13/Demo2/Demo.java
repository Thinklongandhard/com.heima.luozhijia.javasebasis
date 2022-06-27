package JavaSEAdvance.com.luozhijiaTest.day13.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:48
 */
public class Demo {
    public static void main(String[] args) {
        Box b = new Box();
        Thread t = new Thread(b);
//        Thread t1 = new Thread(b);
        t.start();
//        t1.start();

    }
}
