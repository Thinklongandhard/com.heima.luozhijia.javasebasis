package JavaSEAdvance.com.luozhijia.day04.Demo09SimpleCalendarTest;

import java.util.Calendar;

/**
 * @anthor longway
 * @create 2022-06-16
 * 10:53
 */
//获取任意一年的二月有多少天
public class CalendarDemo9 {
    public int show(int i){
        Calendar c = Calendar.getInstance();
        //设置为当年三月的第一天
        c.set(i,3,1);
        //月份从0开始
        //减一天
        c.add(Calendar.MARCH,-1);
        c.add(Calendar.DATE,-1);
        int i1 = c.get(Calendar.DATE);
        return i1;
    }
}
