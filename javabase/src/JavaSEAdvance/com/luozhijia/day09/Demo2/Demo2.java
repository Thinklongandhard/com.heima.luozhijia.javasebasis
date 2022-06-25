package JavaSEAdvance.com.luozhijia.day09.Demo2;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 9:16
 */
public class Demo2 {
    public static void main(String[] args) {
        BufferedInputStream bu = null;
        BufferedOutputStream wri = null;
        try {
            bu = new BufferedInputStream(new FileInputStream("G:\\桌面\\Java笔记\\材料\\WLOP Aeolian3 by Eliza Final.mp4"));
            wri = new BufferedOutputStream(new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo2/WLOP Aeolian3 by Eliza Final.mp4"));
            byte[] bas = new byte[1024];
            int len;
            while ((len = bu.read(bas))!=-1){
                wri.write(bas);
            }

            wri.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bu != null){
                try {
                    bu.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (wri != null){
                try {
                    wri.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
