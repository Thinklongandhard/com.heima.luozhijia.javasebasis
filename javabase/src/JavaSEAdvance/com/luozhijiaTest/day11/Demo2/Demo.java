package JavaSEAdvance.com.luozhijiaTest.day11.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:04
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t1 = new Thread(m);
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
