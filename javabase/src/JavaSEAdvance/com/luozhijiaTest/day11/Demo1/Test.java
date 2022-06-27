package JavaSEAdvance.com.luozhijiaTest.day11.Demo1;

/**
 * @anthor longway
 * @create 2022-06-25
 * 17:59
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Demo();
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
