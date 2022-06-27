package JavaSEAdvance.com.luozhijiaTest.day13.Demo2;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:49
 */
public class Box implements Runnable{
    One one;
    Two two;
    public void show(){
        //主线程
        Thread.currentThread().setName("主线程");
        //调用one
        one.show1(two);
    }

    @Override
    public void run() {
        //副线程
        Thread.currentThread().setName("副线程");
        //调用two
        two.show2(one);
    }
}
