package JavaSEAdvance.com.luozhijia.day12.Demo5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:45
 */
public class SocketDemo {
    public static void main(String[] args) {
        //客户端
        try {
            Socket soc = new Socket("luozhijiacom",10000);
            //发送数据
            OutputStream out = soc.getOutputStream();
            out.write("hello,world".getBytes());
            //释放资源
            soc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
