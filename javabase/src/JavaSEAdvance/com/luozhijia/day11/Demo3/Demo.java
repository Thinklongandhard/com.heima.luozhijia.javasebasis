package JavaSEAdvance.com.luozhijia.day11.Demo3;

/**
 * @anthor longway
 * @create 2022-06-23
 * 11:24
 */
/*
方式2： 实现Runnable接口
	    定义一个类MyThread实现Runable接口
		在MyRunnable类中重写run方法
		创建MyRunnable类的对象
		创建Thread类的对象，把MyRunnable对象作为构造方法的参数
		启动线程
 */
public class Demo {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        //都是通过一个对象创建的线程
        //保证了我们线程处理的对象是同一个（多个程序分工处理一个资源）
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
