package JavaSEAdvance.com.luozhijia.day08.FileOutPutStreamDemo06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 12:26
 */
public class Demo {
    public static void main(String[] args) {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("G:\\桌面\\Java笔记\\笔记\\黑马学习记录\\javaSE-进阶\\day01-继承\\day01");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //写数据
            file.write('a');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
