package JavaSEAdvance.com.luozhijiaTest.day13.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:56
 */
public class Two {
    public synchronized void show2(One o){
        String name = Thread.currentThread().getName();
        System.out.println(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //调用Oen方法
        o.last();
    }
    public void last(){
        System.out.println("进入了Two方法中的last方法");
    }
}
