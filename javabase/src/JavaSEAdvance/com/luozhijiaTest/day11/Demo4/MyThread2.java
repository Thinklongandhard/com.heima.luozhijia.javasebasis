package JavaSEAdvance.com.luozhijiaTest.day11.Demo4;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:21
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("主线程");
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + "计算1-1000的累加和，结果为：" + sum);
    }
}
