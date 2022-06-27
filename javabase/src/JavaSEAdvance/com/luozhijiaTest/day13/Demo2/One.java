package JavaSEAdvance.com.luozhijiaTest.day13.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:48
 */
public class One{
    public synchronized void show1(Two t){
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            //睡眠
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //调用One中的方法
        t.last();
    }
    public void last(){
        System.out.println("进入了One的last方法");
    }
}
