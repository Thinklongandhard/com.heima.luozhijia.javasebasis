package JavaSEAdvance.com.luozhijia.day09.Demo7;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 18:26
 */
public class Demo {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        BufferedReader read = null;
        try {
            writer = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo7/java.txt"));
            read = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo5/java.txt"));
            //读
            String line;
            while ((line = read.readLine()) != null){
                writer.write(line);
                writer.newLine();
                writer.flush();
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
