package JavaSEAdvance.com.luozhijia.day04.Demo09SimpleCalendarTest;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-16
 * 10:57
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        CalendarDemo9 c9 = new CalendarDemo9();
        int show = c9.show(year);
        System.out.println(show);
    }
}
