package JavaSEAdvance.com.luozhijia.day08.FileInPutStreamDemo09Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 16:12
 */
public class Demo {
    public static void main(String[] args) {
        //创建流
        FileOutputStream out = null;
        FileInputStream in = null;
        try {
            //读数据到内存
            out = new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo09Test/IO.txt");
            in = new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo08/IO.txt");
            //读数据
            int by;
            while ((by=in.read()) != -1){
                //写数据
                out.write(by);
                //System.out.print((char)by);
            }


            //刷新
            //out.flush();
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
