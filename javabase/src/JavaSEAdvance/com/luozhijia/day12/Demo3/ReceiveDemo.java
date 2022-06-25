package JavaSEAdvance.com.luozhijia.day12.Demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @anthor longway
 * @create 2022-06-24
 * 11:04
 */
//接受数据，因为不知道接受端发送数据什么时候停止，故采用死循环接受
public class ReceiveDemo {
    public static void main(String[] args) {
        //接收数据
        try {
            DatagramSocket ds = new DatagramSocket(10086);
            while (true) {
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);
                ds.receive(dp);
                //解析
                byte[] data = dp.getData();
                //获取长度
                int length = dp.getLength();
                System.out.println(new String(data, 0, length));

            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
