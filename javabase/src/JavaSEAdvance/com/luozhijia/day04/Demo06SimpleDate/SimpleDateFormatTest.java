package JavaSEAdvance.com.luozhijia.day04.Demo06SimpleDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @anthor longway
 * @create 2022-06-16
 * 9:16
 */
/*
构造方法：
public SimpleDateFormat()
//构造一个SimpleDateFormat，
使用默认模式和日期格式
public SimpleDateFormat(String pattern)
//构造一个SimpleDateFormat，
使用给定的模式和默认的日期格式
*/
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        //无参
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化，从Date到String
        Date d = new Date();
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("---------");

        //解析
        //从String --> Date
        String ss = "2022-06-16 09:23:20";
        //ParseException  解析异常
        //格式不匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d2 = sdf2.parse(ss);
            System.out.println(d2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
