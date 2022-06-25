package JavaSEAdvance.com.luozhijia.day10.Demo1;

import java.io.*;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 15:28
 */
public class IOgo {
    public void show(TreeSet<Student> ts){
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo1/IO.txt"));
            StringBuilder sb = new StringBuilder();
            for (Student s : ts){
                sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMaths()).append(",").append(s.getEnglish() +"\r\n");
            }
            out.write(String.valueOf(sb));
            out.flush();
            out.newLine();

            int[] arr = {};

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
