package JavaSEAdvance.com.luozhijia.day13.Demo5;

/**
 * @anthor longway
 * @create 2022-06-25
 * 14:29
 */
public class PrintString implements Printer{
    @Override
    public void printUpperCase(String s) {
        String s1 = s.toUpperCase();
        System.out.println(s1);
//        return s1;
    }
}
