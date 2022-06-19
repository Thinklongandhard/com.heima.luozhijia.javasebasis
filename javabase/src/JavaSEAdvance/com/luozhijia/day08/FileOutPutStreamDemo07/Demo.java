package JavaSEAdvance.com.luozhijia.day08.FileOutPutStreamDemo07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-06-19
 * 15:36
 */
//输出流写入规范
public class Demo {
    public static void main(String[] args) {
        //创建对象
        FileOutputStream file = null;
        try {
            //对流对象进行赋值
            file = new FileOutputStream("");
            //在这里进行对写入流对象的操作



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {  //finally确定该语句块一定会被执行
            if (file != null){  //确保赋值后不为空
                //关闭流
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
