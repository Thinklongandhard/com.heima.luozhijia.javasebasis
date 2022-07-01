package JavaSEAdvance.com.luozhijiaTest.day14.Demo1;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:24
 */
/*
请使用Lambda表达式启动一个Thread线程，线程中打印：1--100所有数字。
 */
public class Demo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }
        });
        t1.start();
        //第二种
//        Runnable r = (() -> {
//            for (int i = 1; i <= 100; i++) {
//                System.out.println(i);
//            }
//        });
//        r.run();
    }
}
