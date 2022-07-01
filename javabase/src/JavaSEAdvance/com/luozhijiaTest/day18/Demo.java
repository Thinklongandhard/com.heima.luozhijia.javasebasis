package JavaSEAdvance.com.luozhijiaTest.day18;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-29
 * 18:24
 */
/*
    1. 请定义TCP的客户端，向服务器端发送一条信息：你好，我是客户端小白。
	2. 请定义TCP的服务器端，接收这条信息，并打印到控制台

 */
public class Demo {
    public static void main(String[] args) {
        //客户端
        try {
            //创建客户端
            Socket s = new Socket("luozhijiacom",10001);
            OutputStream os = s.getOutputStream();
            os.write("你好，我是客户端小白".getBytes());
            //释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
