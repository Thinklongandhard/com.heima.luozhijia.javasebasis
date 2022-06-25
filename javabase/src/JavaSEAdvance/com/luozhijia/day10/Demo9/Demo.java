package JavaSEAdvance.com.luozhijia.day10.Demo9;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-22
 * 16:23
 */
public class Demo {
    public static void main(String[] args) {
        //从集合到文件
        //myStore();

        //从文件到集合
        myload();
    }

    //从文件到集合
    private static void myload() {
        //创建一个集合接收
        Properties pro = new Properties();
        //创建流
        try(Reader reader = new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo9/IO.txt");) {
            //读
            pro.load(reader);
            Set<String> s = pro.stringPropertyNames();
            for (String key : s){
                String value = pro.getProperty(key);
                System.out.println(key + "," + value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //从集合到文件
    private static void myStore() {
        //定义一个集合
        Properties pro = new Properties();
        //添加元素
        pro.setProperty("9897","liu");
        pro.setProperty("5645","hua");
        pro.setProperty("1984","lil");
        //定义IO


        try(Writer writer = new FileWriter("javabase/src/JavaSEAdvance/com/luozhijia/day10/Demo9/IO.txt");) {
            pro.store(writer,null);  //comments : 对字符串的描述信息，如果不想描述就定义为null
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
