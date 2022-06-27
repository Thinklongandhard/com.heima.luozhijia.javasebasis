package JavaSEAdvance.com.luozhijiaTest.day01.Demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-19
 * 19:48
 */

/*请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，
程序要能够计算并打印他来到世界xx天。*/
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //接受一个字符串
        String dat = sc.next();
        //创建一个SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            //输入生日
            Date date = sdf.parse(dat);

            //创建时间时间
            Date now = new Date();
            if (date.after(now)){  //格式一样
                System.out.println("生日必须早于当前日期");
            }

            long mil = now.getTime() - date.getTime();
            mil = mil /1000 / 60 /60 / 24 /365;
            System.out.println(mil);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
