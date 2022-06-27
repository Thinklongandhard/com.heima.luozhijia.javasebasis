package JavaSEAdvance.com.luozhijiaTest.day11.Demo1;

/**
 * @anthor longway
 * @create 2022-06-25
 * 17:57
 */
public class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
