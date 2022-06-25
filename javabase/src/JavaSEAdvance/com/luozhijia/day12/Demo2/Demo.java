package JavaSEAdvance.com.luozhijia.day12.Demo2;

import java.io.IOException;
import java.net.*;

/**
 * @anthor longway
 * @create 2022-06-24
 * 10:34
 */
/*
步骤：
		1、创建发送端的Socket对象（DatagramSocket）
		2、创建数据，并把数据打包
		3、调用DatagramSocket对象的方法发送数据
		4、关闭发送端
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        try {
            DatagramSocket ds = new DatagramSocket();
            //创建数据
            //创建数据
            byte[] bys = "hellosdsi".getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("luozhijiacom"),17869);
            //调用方法发送数据
            ds.send(dp);
            //关闭端口
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
