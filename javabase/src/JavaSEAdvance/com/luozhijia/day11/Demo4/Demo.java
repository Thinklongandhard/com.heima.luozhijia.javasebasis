package JavaSEAdvance.com.luozhijia.day11.Demo4;

/**
 * @anthor longway
 * @create 2022-06-23
 * 11:41
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        Thread t1 = new Thread(m,"窗口1");
        Thread t2 = new Thread(m,"窗口2");
        Thread t3 = new Thread(m,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
