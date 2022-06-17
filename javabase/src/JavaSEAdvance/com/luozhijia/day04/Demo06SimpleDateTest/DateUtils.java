package JavaSEAdvance.com.luozhijia.day04.Demo06SimpleDateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-16
 * 9:39
 */
//包含两个方法：
     // 把日期转换为指定格式的字符串
     // 把字符串解析为指定格式的日期
public class DateUtils {
    public String show(Date d){
        String s = "";
        // 把日期转换为指定格式的字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        s = sdf.format(d);
        return s;
    }
   //方法2
   public Date day(String s){
       // 把字符串解析为指定格式的日期
       Date d = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       try {
           d = sdf.parse(s);
       } catch (ParseException e) {
           e.printStackTrace();
       }
       return d;
   }
}
