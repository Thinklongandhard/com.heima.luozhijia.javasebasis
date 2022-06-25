package JavaSEAdvance.com.luozhijia.day12.Demo6Test;

import java.io.*;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 15:54
 */
public class SocketDemo {
    public static void main(String[] args) {
        //客户端发送数据
        //数据来源于键盘录入
        //创建对象
        try {
            Socket soc = new Socket("luozhijiacom",10000);
            //创建一个输出流5
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String len;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(soc.getOutputStream()));
            while ((len = br.readLine()) != null){
                if (len.equals("886")){
                    break;
                }
                //如果不是886就写数据
                bw.write(len);
                bw.newLine();
                bw.flush();

            }
            //释放资源
            soc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
