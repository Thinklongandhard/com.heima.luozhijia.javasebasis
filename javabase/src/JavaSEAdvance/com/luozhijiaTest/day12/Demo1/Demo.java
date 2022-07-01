package JavaSEAdvance.com.luozhijiaTest.day12.Demo1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @anthor longway
 * @create 2022-06-28
 * 14:49
 */
/*
请编写程序，不使用任何同步技术，模拟三个窗口同时卖100张票的情况，运行并打印结果，观察到错误的数据，并解释出现错误的原因。
 */
public class Demo implements Runnable{
    private static int num = 100;
    final Lock lock = new ReentrantLock();
    //创建Condition对象
//    Condition con = new Con
    final Condition not = lock.newCondition();
    final Condition empty = lock.newCondition();
    /*
     final Lock lock = new ReentrantLock();
     final Condition notFull  = lock.newCondition();
     final Condition notEmpty = lock.newCondition();
     */


//    Lock lock = new ReentrantLock();
//    private static Object obj = new Object();
    //请使用“同步代码块”改写1.1的程序，保证运行结果的正确。
    @Override
    public void run() {
        //模拟买票
//        synchronized (obj) {
//            while (num > 0){
//                String name = Thread.currentThread().getName();
//                System.out.println(name + "在买第" + num + "张票");
//                num--;
//                //先唤醒
//                obj.notify();
//                //该线程休眠
//                try {
//                    obj.wait();
//                    obj.notifyAll();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        //调用同步方法

        show();
        show1();
    }
    //请使用“同步方法”改写1.1的程序，保证运行结果的正确。
//    public synchronized void show(){
////        Object obj = new Object();
//        //模拟买票
//        while (num > 0) {
//            String name = Thread.currentThread().getName();
//            System.out.println(name + "在买第" + num + "张票");
//            num--;
//            //先唤醒
//            this.notify();
//            //该线程休眠
//            try {
//                this.wait();
//                this.notifyAll();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
    //请使用“Lock锁”改写1.1的程序，保证运行结果的正确
    /*
    Condition
    通过将它们与使用任意的组合的效果Lock个实现。 Lock替换synchronized方法和语句的使用， Condition取代了对象监视器方法的使用。
     */
    public void show(){
//        Object obj = new Object();
        //模拟买票
        //void lock() 获得锁
        lock.lock();
        while (num > 0) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "在买第" + num + "张票");
            num--;
            //先唤醒
            not.signal();
            //该线程休眠
            try {
                not.await();
                not.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //释放锁
        lock.unlock();
    }
    public void show1(){
//        Object obj = new Object();
        //模拟买票
        //void lock() 获得锁
        lock.lock();
        while (num > 0) {
            String name = Thread.currentThread().getName();
            System.out.println(name + "在买第" + num + "张票");
            num--;
            //先唤醒
            empty.signal();
            //该线程休眠
            try {
                empty.await();
                empty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //释放锁
        lock.unlock();
    }
}
