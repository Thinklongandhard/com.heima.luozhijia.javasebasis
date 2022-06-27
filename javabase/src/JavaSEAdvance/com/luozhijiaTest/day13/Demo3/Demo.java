package JavaSEAdvance.com.luozhijiaTest.day13.Demo3;

/**
 * @anthor longway
 * @create 2022-06-25
 * 16:16
 */
/*
    请用“等待唤醒”机制编写一个程序，要求：
	第一个线程：遍历1--1000所有的数字，在遍历过程中，如果发现这个数字能同时被
					2,3,5,7整除，立即wait()退出进入等待，让第二个线程进入。
	第二个线程：运行后，将一个计数器 + 1，之后再唤醒等待的线程。

	主线程中：休息2秒，让两个线程全部执行完毕，打印“计数器”的结果。


 */
public class Demo implements Runnable {
    //    private int num = 0;
    Object obj;

    public Demo(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj) {
            try {
                for (int i = 1; i <= 1000; i++) {

                    if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                        //唤醒上个线程
                        obj.notify();
//                        Demo1 d1 = new Demo1();
                        obj.wait();
                    }
                }
                Demo1.b = false;
                obj.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
