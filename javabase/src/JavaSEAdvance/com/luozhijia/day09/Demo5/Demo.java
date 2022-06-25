package JavaSEAdvance.com.luozhijia.day09.Demo5;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 18:01
 */
public class Demo {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo3/java.txt"));
            out = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo5/java.txt"));

            char[] chars = new char[1024];
            int len;
            while ((len = in.read(chars)) != -1){
                out.write(new String(chars,0,len));
            }

            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
