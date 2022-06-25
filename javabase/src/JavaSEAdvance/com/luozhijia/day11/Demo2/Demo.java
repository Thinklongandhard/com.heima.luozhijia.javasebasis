package JavaSEAdvance.com.luozhijia.day11.Demo2;

/**
 * @anthor longway
 * @create 2022-06-23
 * 10:06
 */
public class Demo {
    public static void main(String[] args) {
        //给线程命名
        //方式1
        MyThread t1 = new MyThread("liu");
        MyThread t2 = new MyThread("yao");
        MyThread t3 = new MyThread("luo");
        //设置优先级
        //高优先级会抢占低优先级的时间片，抢占CPU时间片的概率更高
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        t1.setPriority(1);
        t2.setPriority(1);
        t3.setPriority(10);
        //启动线程
        t1.start();
        //设置t1线程死亡后，t2,t3开始启动
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //设置T2,T3为守护线程
        t2.setDaemon(true);
        t3.setDaemon(true);
        t2.start();
        t3.start();
        //守护线程在主线程执行结束后不会立马结束，会很快结束线程

    }
}
