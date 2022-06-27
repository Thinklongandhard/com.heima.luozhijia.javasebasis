package JavaSEAdvance.com.luozhijiaTest.day01.Demo4;

import java.text.SimpleDateFormat;

/**
 * @anthor longway
 * @create 2022-06-19
 * 20:22
 */
public class Demo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        long timeMillis = System.currentTimeMillis();
        System.out.println(sdf.format(timeMillis));
    }
}
