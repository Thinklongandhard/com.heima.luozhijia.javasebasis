package JavaSEAdvance.com.luozhijia.day15.Demo8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-06-29
 * 11:55
 */
public class Demo {
    public static void main(String[] args) {
        //通过配置文件访问方法方法
        /*
        className=JavaSEAdvance.com.luozhijia.day15.Demo5.Student
        methodName=show
         */
        try {
            //创建Properties对象获取文件中的值
            Properties pro = new Properties();
            FileReader br = new FileReader("javabase/src/JavaSEAdvance/com/luozhijia/day15/Demo8/text.txt");
            pro.load(br);
            //class文件中不能有分号
            String className = pro.getProperty("className");
            String methodName = pro.getProperty("methodName");
            //通过获取到的className创建class对象
            Class<?> c = Class.forName(className);
            //创建对象
            Object obj = c.newInstance();
            //访问方法
            Method m = c.getDeclaredMethod(methodName);
            //暴力反射
            m.setAccessible(true);
            Object o = m.invoke(obj);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
