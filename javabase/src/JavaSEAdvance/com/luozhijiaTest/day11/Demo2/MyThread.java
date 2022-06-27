package JavaSEAdvance.com.luozhijiaTest.day11.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:02
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Thread.currentThread().setName("副线程");
            System.out.println(Thread.currentThread().getName() + " " + i);


        }
    }
}
