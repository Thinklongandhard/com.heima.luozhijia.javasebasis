package JavaSEAdvance.com.luozhijia.day08.FileInPutStreamDemo08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 15:47
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        byte[] b1 = null;
        try {
            out = new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo08/IO.txt");
            in = new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo08/IO.txt");
            //写数据
//            out.write('a');
//            out.write('b');
//            out.write('c');
//            out.write('d');
//            out.write('e');
            b1 = new byte[]{'a','b','c','d','e','f'};
            out.write(b1);


            //读数据
//            int read = in.read();  //一个字节一个字节的读
//            int read2 = in.read();
//            System.out.println(read);
//            System.out.println(read2);
            //优化
            int by;
            while((by=in.read()) != -1){
                System.out.print((char)by);
            }


            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
