package JavaSEAdvance.com.luozhijiaTest.day11.Demo3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-25
 * 18:06
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            //
            for (int i = 0; i < 10; i++) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long da = System.currentTimeMillis();
                Date da1 = new Date(da);
                String s = sdf.format(da1);
                System.out.println(s);
                Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
