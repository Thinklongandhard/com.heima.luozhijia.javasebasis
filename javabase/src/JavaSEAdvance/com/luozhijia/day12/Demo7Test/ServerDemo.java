package JavaSEAdvance.com.luozhijia.day12.Demo7Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 19:25
 */
public class ServerDemo {
    public static void main(String[] args) {
        //创建服务端对象
        try {
            ServerSocket ss = new ServerSocket(10000);
            //监控
            Socket s = ss.accept();
            //创建读取数据的对象
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            //创建写数据对象，写数据到文本文件中
            BufferedWriter bw = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day12/Demo7Test/IO.txt"));
            //读数据
            String len;
            while ((len = br.readLine()) != null){
                //输出到控制台
                System.out.println(len);
                //写数据到文本文件
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
            //释放资源
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
