package JavaSEAdvance.com.luozhijiaTest.day18;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-29
 * 18:29
 */
//2. 请定义TCP的服务器端，接收这条信息，并打印到控制台
public class Server {
    public static void main(String[] args) {
        //服务端
        try {
            //创建一个服务器端
            ServerSocket ss = new ServerSocket(10001);
            //监听是否连接
            Socket s = ss.accept();
            //获取资源
            InputStream in = s.getInputStream();

            int len;
            byte[] bys = new byte[1024];
            while ((len = in.read(bys)) != -1){
                System.out.println(new String(bys,0,len));
            }
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
