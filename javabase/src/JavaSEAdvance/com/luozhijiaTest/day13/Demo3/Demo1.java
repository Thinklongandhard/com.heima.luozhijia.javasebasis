package JavaSEAdvance.com.luozhijiaTest.day13.Demo3;

/**
 * @anthor longway
 * @create 2022-06-25
 * 16:59
 */
public class Demo1 implements Runnable{
    Object obj;
    public static boolean b = true;
    public int count = 0;
    public Demo1(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (!b){
                    break;
                }

                try {
                    count++;
                    //唤醒线程

                    obj.notify();
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
