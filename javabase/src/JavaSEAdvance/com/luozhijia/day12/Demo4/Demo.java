package JavaSEAdvance.com.luozhijia.day12.Demo4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:14
 */
public class Demo {
    public static void main(String[] args) {
        //创建Socket对象
        try {
            Socket soc = new Socket("luozhijiacom",10086);
            //获取输入流
            OutputStream os = soc.getOutputStream();
            //写数据
            os.write("hello,我来了".getBytes());
            //释放资源
            soc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
