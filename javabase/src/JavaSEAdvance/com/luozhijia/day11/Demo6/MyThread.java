package JavaSEAdvance.com.luozhijia.day11.Demo6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @anthor longway
 * @create 2022-06-23
 * 16:17
 */
public class MyThread implements Runnable {
    private static int num = 100;
    //    Object obj = new Object();
    int x = 0;
    //创建一个Lock锁对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //加锁
            try{
                lock.lock();
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在买票" + num);
                    num--;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
