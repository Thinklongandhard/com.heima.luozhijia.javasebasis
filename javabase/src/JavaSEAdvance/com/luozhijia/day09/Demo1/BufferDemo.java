package JavaSEAdvance.com.luozhijia.day09.Demo1;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 8:48
 */
public class BufferDemo {
    public static void main(String[] args) {
        BufferedOutputStream out = null;
        BufferedInputStream in = null;
        try {
//            out = new BufferedOutputStream(new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo1/IO.txt"));
            in = new BufferedInputStream(new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo1/IO.txt"));
//
//            out.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
//            out.write("word\r\n".getBytes(StandardCharsets.UTF_8));

            //读
//            int bys;
//            while ((bys = in.read()) != -1){
//                System.out.print((char)bys);
//            }
            byte[] b = new byte[1024];
            int len;
            while ((len = in.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }

            //刷新
//            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
