package JavaSEAdvance.com.luozhijia.day09.Demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @anthor longway
 * @create 2022-06-20
 * 17:00
 */
/*
    void write(int c)
	  //写一个字符
	void wirte(char[] cbuf)
	  //写入一个字符数组
	void write(char[] cbuf,int off,int len)
	  //写入字符数组的一部分
	void write(String str)
	  //写一个字符串
	void wirte(String str,int off,int len)
	  //写一个字符串的一部分
 */
public class Demo {
    public static void main(String[] args) {
        OutputStreamWriter out = null;
        try {
            out = new OutputStreamWriter(new FileOutputStream("javabase/src/JavaSEAdvance/com/luozhijia/day09/Demo3/java.txt"));
            //void write(int c)
            //写一个字符
            //out.write('c');

            //void wirte(char[] cbuf)
            char[] cbuf = new char[]{'a','b','c'};
//            out.write(cbuf);

            //void write(char[] cbuf,int off,int len)
//            out.write(cbuf,0,3);

            //void wirte(String str,int off,int len) //这个len是字符串中的长度
            String s = "abcdasd中国sdawdddada";
            out.write(s,0,10);

            //刷新
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
