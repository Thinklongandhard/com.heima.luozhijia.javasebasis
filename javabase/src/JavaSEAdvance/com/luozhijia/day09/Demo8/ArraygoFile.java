package JavaSEAdvance.com.luozhijia.day09.Demo8;

import java.io.*;
import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-20
 * 19:50
 */
public class ArraygoFile {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<String> arr = new ArrayList<String>();
        //存储字符串数据
        arr.add("aaa");
        arr.add("bbb");
        arr.add("aadaasd");
        BufferedWriter writer = null;
        BufferedReader read = null;
        try {
            writer = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo8/java.txt"));
            read = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo8/java.txt"));
            //遍历集合写入文本文件
            for (String s : arr){
                writer.write(s);
                writer.newLine();
                writer.flush();  //这里是字符缓冲流所以每次循环存储的对象都在缓存区，需要进行刷新才能有数据
            }
            //读取数据

            String line;
            while ((line = read.readLine()) != null){
                System.out.println(line);
            }

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
