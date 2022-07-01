package JavaSEAdvance.com.luozhijia.day16Junit.Demo3Test;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @anthor longway
 * @create 2022-06-30
 * 14:44
 */
/*
当有注解被执行，就会看该方法是否可以正常运行
 */
public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取配置文件
        Properties pro = new Properties();
        InputStream file = new FileInputStream("javabase/src/JavaSEAdvance/com/luozhijia/day16Junit/Demo3Test/test.Properties");
        pro.load(file);
        //读取文件
        Object className = pro.get("className");
        //获取Class文件
        Class<?> c = Class.forName((String) className);
        //创建对象
        Object d = c.newInstance();
        //获取测试类。class文件
        Class demoClass = d.getClass();
        //获取所有方法
        Method[] methods = demoClass.getMethods();

        int num = 0;  //计数器
        BufferedWriter bw = new BufferedWriter(new FileWriter("Bug.txt"));


        for (Method m : methods){
            //检测是否有注解
            //检测是否有Check注解
            if (m.isAnnotationPresent(Check.class)){
                //执行方法
                try {
                    Object invoke = m.invoke(d);
                } catch (Exception e) {
                    //捕获异常
                    //将异常写到文件中
                    num++;
                    bw.write(m.getName() +" 方法出现异常");
                    bw.newLine();
                    bw.write("异常的名称是 " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是 " + e.getCause().toString());
                    bw.newLine();
                    bw.write("-------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("出现异常次数 " + num);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
