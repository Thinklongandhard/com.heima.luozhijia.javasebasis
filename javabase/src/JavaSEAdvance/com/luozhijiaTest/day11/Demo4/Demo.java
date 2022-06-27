package JavaSEAdvance.com.luozhijiaTest.day11.Demo4;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:22
 *
 */
public class Demo {
    public static void main(String[] args) {
        Thread d1 = new MyThread1();
        Thread d2 = new MyThread2();

        d1.start();
        d2.start();
    }
}
