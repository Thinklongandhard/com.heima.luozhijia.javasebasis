package JavaSEAdvance.com.luozhijiaTest.day13.Demo3;

/**
 * @anthor longway
 * @create 2022-06-25
 * 16:45
 */
public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        Demo d = new Demo(obj);
        Demo1 d1 = new Demo1(obj);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d1);

        t1.start();
        t2.start();

        try {
            Thread.sleep(200);
            System.out.println(d1.count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
