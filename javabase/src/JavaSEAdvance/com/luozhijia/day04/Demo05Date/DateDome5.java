package JavaSEAdvance.com.luozhijia.day04.Demo05Date;

import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-16
 * 8:52
 */

//Date的常用方法
public class DateDome5 {
    public static void main(String[] args) {
        //public long getTime()
        Date d = new Date();
        long date = d.getTime();
        date = (long) (date*1.0/1000/60/60/24/365);
        System.out.println(date);
        //public void setTime(long Time)
        System.out.println("----------");
        date = System.currentTimeMillis();
        d.setTime(date);
        //设置时间
        System.out.println(d);

    }
}
