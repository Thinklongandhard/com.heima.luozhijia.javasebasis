package JavaSEAdvance.com.luozhijia.day12.Demo5;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:42
 */
public class InputDemo {
    public static void main(String[] args) {
        //接收数据端
        //创建对象
        try {
            ServerSocket ss = new ServerSocket(10000);
            //监听是否有客服端发送数据
            Socket s = ss.accept();
            //创建一个输入流
            InputStream read = s.getInputStream();
            int len;
            byte[] b = new byte[1024];
            while ((len = read.read(b)) != -1){
                System.out.println(new String(b,0,len));
            }
            //释放资源
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
