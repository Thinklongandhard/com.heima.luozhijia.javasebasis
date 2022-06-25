package JavaSEAdvance.com.luozhijia.day11.Demo4;

/**
 * @anthor longway
 * @create 2022-06-23
 * 11:40
 */
public class MyThread implements Runnable {
    private static int num = 100;
//    Object obj = new Object();
    int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (MyThread.class) {
                    if (num > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在买票" + num);
                        num--;
                    }
                }
            } else {
//                synchronized (obj) {
//                    if (num > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在买票" + num);
//                        num--;
//                    }
//                }
                skiltacket();
            }
            x++;
        }

    }

    //    private void skiltacket() {
//        synchronized (obj) {
//            if (num > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在买票" + num);
//                num--;
//            }
//        }
//    }
    //同步方法，方法枷锁
    //同步方法的锁是this
//    private synchronized void skiltacket() {
//        if (num > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在买票" + num);
//            num--;
//        }
//    }
    //同步静态方法
    //方法加锁
    private static synchronized void skiltacket() {
        if (num > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在买票" + num);
            num--;
        }
    }
}
