package JavaSEAdvance.com.luozhijiaTest.day11.Demo4;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:17
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        int sum = 0;
        Thread.currentThread().setName("副线程");
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "计算1-100的累加和，结果为：" + sum);
    }
}
