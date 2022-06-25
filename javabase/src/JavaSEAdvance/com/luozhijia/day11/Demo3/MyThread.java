package JavaSEAdvance.com.luozhijia.day11.Demo3;

/**
 * @anthor longway
 * @create 2022-06-23
 * 11:23
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
