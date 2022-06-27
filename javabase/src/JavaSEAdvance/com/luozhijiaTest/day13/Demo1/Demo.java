package JavaSEAdvance.com.luozhijiaTest.day13.Demo1;

/**
 * @anthor longway
 * @create 2022-06-25
 * 15:34
 */
/*
	定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
	定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。

 */
public class Demo {
    public static void main(String[] args) {
        CollectionDemo c = new CollectionDemo();
        Thread t = new Thread(c);
        //启动线程
        t.start();
        try {
            Object obj = c.call();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
