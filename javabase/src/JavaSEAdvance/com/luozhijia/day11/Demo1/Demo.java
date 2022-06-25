package JavaSEAdvance.com.luozhijia.day11.Demo1;

/**
 * @anthor longway
 * @create 2022-06-23
 * 9:12
 */
/*
实现线程
 */
public class Demo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
//        t.run();
        MyThread t2 = new MyThread();
//        t2.run();
        t.start();
        t2.start();
    }
}
