package JavaSEAdvance.com.luozhijia.day12.Demo6Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:49
 */
public class ServerSocketDemo {
    public static void main(String[] args) {
        //因为不知道什么时候会接收到数据，死循环
        //创建对象
        try {
            ServerSocket ss = new ServerSocket(10000);
            //监听数据
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String len;
            while ((len=br.readLine()) != null){
                System.out.println(len);
            }

            //释放资源
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
