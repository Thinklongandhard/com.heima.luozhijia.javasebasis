package JavaSEAdvance.com.luozhijia.day08.FileInPutStreamDemo11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 16:57
 */
public class Demo {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\JavaSE-基础\\day04-数组\\两个数组内存图.png");
            out = new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo11\\两个数组内存图.png");
            //读
            byte[] bys = new byte[1024];
            int len;
            while ((len = in.read(bys)) != -1){
                //写
                out.write(bys);
            }

            //刷新
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
