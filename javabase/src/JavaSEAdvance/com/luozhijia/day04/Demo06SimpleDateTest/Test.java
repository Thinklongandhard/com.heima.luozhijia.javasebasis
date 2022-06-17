package JavaSEAdvance.com.luozhijia.day04.Demo06SimpleDateTest;

import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-16
 * 9:51
 */
public class Test {
    //"yyyy-MM-dd HH:mm:ss"格式
    public static void main(String[] args) {
        DateUtils du = new DateUtils();
        Date day = du.day("2022-11-11 11:11:11");
        System.out.println(day);

        //定义一个Date
        long d = System.currentTimeMillis();
        Date date = new Date();
        date.setTime(d);
        String s = du.show(date);
        System.out.println(s);

    }
}
