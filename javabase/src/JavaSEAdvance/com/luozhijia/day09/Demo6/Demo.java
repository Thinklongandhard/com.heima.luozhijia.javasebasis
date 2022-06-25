package JavaSEAdvance.com.luozhijia.day09.Demo6;

import java.io.*;

/**
 * @anthor longway
 * @create 2022-06-20
 * 18:10
 */
public class Demo {
    public static void main(String[] args) {
//        BufferedWriter writer = null;
        BufferedReader read = null;
        try {
//            writer = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo6/java.txt"));
            read = new BufferedReader(new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo6/java.txt"));
            /*
            BufferedWriter
	             void newLine()
		         写一行行分隔符，行分隔符字符串由系统属性定义

	       BufferedReader
	             public Stirng readLine()
		         读一行文字，结果包含行的内容的字符串，不包含任何终止字符，
			     如果流的结尾已经到达，则为null
             */

//            for (int i = 0; i < 10; i++) {
//                writer.write("hello" + i);
//                //void newLine()
//                writer.newLine();
//                writer.flush();
//            }
            //读取
            //public StirngreadLine()
//            System.out.println(read.readLine());
//            System.out.println(read.readLine());
            while (read.readLine() != null){
                System.out.print(read.readLine());
                //读一行文字，结果包含行的内容的字符串，不包含任何终止字符
            }


            //刷新
//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            if (writer != null){
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
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
