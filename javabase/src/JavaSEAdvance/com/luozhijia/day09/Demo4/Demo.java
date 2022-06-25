package JavaSEAdvance.com.luozhijia.day09.Demo4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-20
 * 17:49
 */
public class Demo {
    public static void main(String[] args) {
        BufferedReader read1 = null;
        try {
            read1 = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo3/java.txt"));
//            int read = read1.read();//一个字节一个字节的读
//            System.out.println((char)read);
            char[] bys = new char[1024];
            int len;
            while ((len = read1.read(bys)) != -1){
                System.out.print(new String(bys,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (read1 != null){
                try {
                    read1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
