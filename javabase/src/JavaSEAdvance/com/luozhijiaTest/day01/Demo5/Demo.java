package JavaSEAdvance.com.luozhijiaTest.day01.Demo5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-19
 * 20:27
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = sdf.parse(next);

            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
            String format = sdf2.format(date);
            System.out.println(format);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
