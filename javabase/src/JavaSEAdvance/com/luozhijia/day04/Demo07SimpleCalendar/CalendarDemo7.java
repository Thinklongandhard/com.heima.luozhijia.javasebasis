package JavaSEAdvance.com.luozhijia.day04.Demo07SimpleCalendar;

import java.util.Calendar;

/**
 * @anthor longway
 * @create 2022-06-16
 * 10:17
 */
public class CalendarDemo7 {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        //public int get(int field)
        //返回给定日历字段的值
        int i = c.get(Calendar.YEAR);
        int i1 = c.get(Calendar.MARCH) + 1;
        int i2 = c.get(Calendar.DATE);
        System.out.println(i + "年" + i1 + "月" + i2 + "日");

    }
}
