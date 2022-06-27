package JavaSEAdvance.com.luozhijia.day14.Demo2;

/**
 * @anthor longway
 * @create 2022-06-26
 * 20:15
 */

public class RunnableDemo {
    public static void main(String[] args) {
        startRunnabel(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "匿名内部类");
            }
        });
        //使用Lambda表达式
        startRunnabel(() -> {
            System.out.println(Thread.currentThread().getName() + "线程启动了");
        });

    }
    private static void startRunnabel(Runnable r){
        //创建一个线程
        new Thread(r).start();
        //没有优化的代码
//        Thread t1 = new Thread(r);
//        t1.start();
    }
}
