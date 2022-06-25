package JavaSEAdvance.com.luozhijia.day11.Demo1;

/**
 * @anthor longway
 * @create 2022-06-23
 * 9:12
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("启动线程");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
