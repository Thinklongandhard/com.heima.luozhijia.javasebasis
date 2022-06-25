package JavaSEAdvance.com.luozhijia.day09.Demo9;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @anthor longway
 * @create 2022-06-20
 * 20:13
 */
public class Demo {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        BufferedReader read = null;
        try {
            writer = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo9/java.txt"));
            read = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo9/java.txt"));
            //写数据
            writer.write("罗志嘉");
            writer.newLine();
            writer.flush();
            writer.write("刘旭");
            writer.newLine();
            writer.flush();
            writer.write("张三");
            writer.newLine();
            writer.flush();
            writer.write("李四");
            writer.newLine();
            writer.flush();
            //读数据到ArrayList集合
            ArrayList<String> arr = new ArrayList<String>();
            String line;
            while ((line=read.readLine()) != null){
                //存入到了集合中
                arr.add(line);
            }
            //产生一个随机数
            Random r = new Random();
            int num = r.nextInt(arr.size());
            System.out.println(arr.get(num));

            //刷新
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (read != null){
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
