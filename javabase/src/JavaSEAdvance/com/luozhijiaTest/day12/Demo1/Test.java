package JavaSEAdvance.com.luozhijiaTest.day12.Demo1;

/**
 * @anthor longway
 * @create 2022-06-28
 * 14:51
 */
/*
请编写程序，不使用任何同步技术，模拟三个窗口同时卖100张票的情况，运行并打印结果，观察到错误的数据，并解释出现错误的原因。
 */
public class Test {
    public static void main(String[] args) {
        //创建线程对象
        Demo d = new Demo();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        /*
        观察到错误的数据，并解释出现错误的原因。
        每个线程都会卖100张票
        因为在run方法中没有进行限制，加锁，每个线程都可以同时访问到run方法
        每个线程都会执行for循环。
         */
    }
}
