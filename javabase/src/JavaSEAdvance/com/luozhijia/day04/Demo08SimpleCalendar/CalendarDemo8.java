package JavaSEAdvance.com.luozhijia.day04.Demo08SimpleCalendar;

import java.util.Calendar;

/**
 * @anthor longway
 * @create 2022-06-16
 * 10:30
 */
public class CalendarDemo8 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //amount：-3 返回现在的年份 +- amount的值
        //需求：三年前的今天
        //c.add(Calendar.YEAR,-3);

        //需求2: 10年后的5天前
        c.add(Calendar.YEAR, -10);
        c.add(Calendar.DATE, -5);
        int i = c.get(Calendar.YEAR);
        int ii = c.get(Calendar.DATE);
        System.out.println(i + "年" + ii + "日");
    }

        //public final void set(int yera,int month,int date)
        	     //设置当前日历的年月日
//        c.set(2018,6,16);
//        int i = c.get(Calendar.YEAR);
//        int ii = c.get(Calendar.MARCH);
//        int iii = c.get(Calendar.DATE);
//        System.out.print(i + " ");
//        System.out.print(ii + " ");
//        System.out.print(iii + " ");
//    }
}
