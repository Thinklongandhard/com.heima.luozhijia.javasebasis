package JavaSEAdvance.com.luozhijia.day09.Demo;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 18:10
 */
public class Test {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        BufferedReader read = null;
        try {
            writer = new BufferedWriter(new FileWriter(""));
            read = new BufferedReader(new FileReader(""));


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
