package JavaSEAdvance.com.luozhijia.day12.Demo7Test;

import java.io.*;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 19:35
 */
public class SorectIODemo {
    public static void main(String[] args) {
        //从文本文件中读取数据
        try {
            Socket s = new Socket("luozhijiacom",10000);
            //创建读取数据流从文本文件中封装文件
            BufferedReader br = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day12/Demo7Test/IOge.txt"));
            //创建读取数据流写到服务端
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            String len;
            while ((len = br.readLine())!= null){
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
            //关闭流
            bw.close();
            //释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
