package JavaSEAdvance.com.luozhijia.day11.Demo2;

/**
 * @anthor longway
 * @create 2022-06-23
 * 10:05
 */
public class MyThread extends Thread{
    //创建构造方法
    public MyThread(){

    }
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //线程暂停
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
