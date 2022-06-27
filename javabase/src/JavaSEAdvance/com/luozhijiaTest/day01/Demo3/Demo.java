package JavaSEAdvance.com.luozhijiaTest.day01.Demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-19
 * 20:11
 */
//请编写程序，从控制台分别接收两个“生日”，
// 格式：yyyy年MM月dd日，
// 程序要能够计算并打印：第一个生日大于/小于第二个生日。
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        try {
            Date d1 = sdf.parse(s1);
            Date d2 = sdf.parse(s2);
            //判断是否早于当前时间
            Date now = new Date();
            if (d1.after(now) & d2.after(now)){
                System.out.println("必须早于当前日期");
            }
            //第一个生日大于/小于第二个生日
            if (d1.before(d2)){
                System.out.println("第一个大");
            }else {
                System.out.println("第二个大");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
