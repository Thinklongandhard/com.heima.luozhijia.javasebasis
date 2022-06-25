package JavaSEAdvance.com.luozhijia.day12.Demo7Test;

import java.io.*;
import java.net.Socket;

/**
 * @anthor longway
 * @create 2022-06-24
 * 19:19
 */
public class SorectDemo {
    public static void main(String[] args) {
        //客户端发送数据
        Socket s = null;
        try {
            s = new Socket("luozhijiacom",10000);
            //键盘录入数据
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //自己写的键盘录入
            //写数据到服务端
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            String len;
            while ((len = br.readLine()) != null){
                if (len.equals("886")){
                    break;
                }
                //不是886，写数据到服务端
                bw.write(len);
                bw.newLine();
                bw.flush();
            }
            //关闭
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
