package JavaSEAdvance.com.luozhijia.day10.Demo4;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-22
 * 11:07
 */
public class Demo {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo4/IO.txt"),true);
            BufferedReader ps = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo3/IO.txt"))
            //读取数据javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo3/IO.txt

        ) {
            String len;
            while ((len = ps.readLine())!=null) {
                pw.println(len);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
