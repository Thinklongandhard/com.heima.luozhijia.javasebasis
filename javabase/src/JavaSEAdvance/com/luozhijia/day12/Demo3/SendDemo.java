package JavaSEAdvance.com.luozhijia.day12.Demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @anthor longway
 * @create 2022-06-24
 * 11:03
 */
//发送数据，数据来自键盘录入，直到输入的数据时886，发送数据结束
public class SendDemo {
    public static void main(String[] args) {
        //创建对象
        try {
            DatagramSocket ds = new DatagramSocket();
            //自己封装一个键盘录入
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //判断
            String len;
            while ((len = br.readLine()) != null){
                if (len.equals("886")){
                    break;
                }
                //不是886，发送数据
                //封装
                byte[] bys = len.getBytes();
                DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("luozhijiacom"),10086);
                ds.send(dp);
            }
            //关闭
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
