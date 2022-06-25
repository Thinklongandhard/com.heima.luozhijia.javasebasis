package JavaSEAdvance.com.luozhijia.day10.Demo3;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-22
 * 10:55
 */
public class Demo {
    public static void main(String[] args) {
        try(PrintWriter ps = new PrintWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo3/IO.txt");
            PrintWriter pw = new PrintWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo3/IO.txt"),true);
        ) {
//           ps.write("hello");
//           ps.flush();

//            ps.println("hello");
//            ps.flush();
            //PrintWrite(Writer out,boolean autoFlush)

            pw.write("hello");
            pw.write("\r\n");
            pw.write("world");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
