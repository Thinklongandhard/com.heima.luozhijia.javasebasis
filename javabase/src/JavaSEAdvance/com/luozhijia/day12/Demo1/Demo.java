package JavaSEAdvance.com.luozhijia.day12.Demo1;

import java.net.InetAddress;

/**
 * @anthor longway
 * @create 2022-06-24
 * 8:58
 */
/*
static InetAddress getByName(String host)
	  //确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
	String getHostName()
	  //获取此IP地址的主机名
	String getHostAddress()
	  //返回文本显示中的IP地址字符串
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        InetAddress byName = InetAddress.getByName("luozhijiacom");
        String name = byName.getHostName();
        String ip = byName.getHostAddress();
        System.out.println("主机名 " + name);
        System.out.println("IP地址 " + ip);

    }
}
