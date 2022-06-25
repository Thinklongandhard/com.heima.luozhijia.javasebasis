package JavaSEAdvance.com.luozhijia.day12.Demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @anthor longway
 * @create 2022-06-24
 * 10:50
 */
/*
步骤：
		1、创建接收端的Socket对象（DatagramSocket）
		2、创建一个数据包，用于接收数据
		3、调用DategramSocket对象的方法接受数据
		4、解析数据包，并把数据在控制台显示
		5、关闭接受端
 */
public class ReceiveDemo {
    public static void main(String[] args) {
        //创建对象
        try {
            //传一个端口号
            DatagramSocket ds = new DatagramSocket(17869);
            //创建一个数据包
            //创建一个byte数组
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //调用方法接受数据
            ds.receive(dp);
            //解析数据
            byte[] data = dp.getData();
            //获取实际接收到的数据长度
            int length = dp.getLength();
            String datas = new String(data,0,length);
            System.out.println(datas);
            //关闭接受端
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
