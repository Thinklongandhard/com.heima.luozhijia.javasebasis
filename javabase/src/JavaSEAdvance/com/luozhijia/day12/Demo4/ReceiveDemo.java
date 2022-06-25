package JavaSEAdvance.com.luozhijia.day12.Demo4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:27
 */
public class ReceiveDemo {
    public static void main(String[] args) {
        //创建接收对象
        try {
            ServerSocket ss = new ServerSocket(10086);
            //监听数据看是否有客户端发送数据
            Socket s = ss.accept();
            //创建一个接收对象
            InputStream is = s.getInputStream();
            byte[] bys = new byte[1024];
            int len;
            while ((len = is.read(bys)) != -1){
                System.out.println(new String(bys,0,len));
            }
            //释放资源
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
