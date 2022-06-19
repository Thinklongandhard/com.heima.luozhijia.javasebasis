package JavaSEAdvance.com.luozhijia.day08.FileInPutStreamDemo10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 16:26
 */
public class Demo {
    public static void main(String[] args) {
        FileInputStream in = null;
        int len;
        try {
            in = new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day08/FileInPutStreamDemo09Test/IO.txt");
            //一个数组一个数组的读
            //System.out.println(in.read(b));
            byte[] b = new byte[3];
//            len = in.read(b);
//            //System.out.print(new String(b));
//            System.out.print(new String(b,0,len));
//            len = in.read(b);
//            //System.out.print(new String(b));
//            System.out.print(new String(b,0,len));
//            len = in.read(b);
//            System.out.print(new String(b,0,len));
            while ((len = in.read(b)) != -1){
                System.out.print(new String(b,0,len));
            }


//            len = in.read(b);  //-1  当全部读取完后会返回-1
//            System.out.print(new String(b,0,len));
//            len = in.read(b);
//            System.out.print(new String(b,0,len));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
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

