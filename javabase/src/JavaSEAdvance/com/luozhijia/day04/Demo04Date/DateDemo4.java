package JavaSEAdvance.com.luozhijia.day04.Demo04Date;

import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-16
 * 8:24
 */

/*构造方法：
        1、public Date()
        //分配一个 Date对象并对其进行初始化，以便它表示分配的时间，
        //测量到最近的毫秒。
        2、public Date(long date)
//分配一个 Date对象，并将其初始化为表示从标准基准时间（称为“时代”）
//即1970年1月1日00:00:00 GMT起的指定毫秒数。*/
public class DateDemo4 {
    public static void main(String[] args) {
        //1、public Date()
        Date d = new Date();
        System.out.println(d);
        //返回一个当前日期的时间
        //Thu Jun 16 08:26:09 CST 2022

        //2、public Date(long date)
        long date = 1000*60*60;  //毫秒*1000 --> 秒*60 --> 分*60 --> 小时
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
