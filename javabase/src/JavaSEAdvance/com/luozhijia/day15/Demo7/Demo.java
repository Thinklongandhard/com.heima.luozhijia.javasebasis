package JavaSEAdvance.com.luozhijia.day15.Demo7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @anthor longway
 * @create 2022-06-29
 * 11:26
 */
//反射调用成员方法并使用
public class Demo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo5.Student");
            //创建对象
            Object obj = c.newInstance();
            //获取成员方法
            Method[] m = c.getDeclaredMethods();
            for (Method me : m){
                System.out.println(me);
            }
            //获取单个成员方法
            Method show = c.getDeclaredMethod("show");  //方法名，方法参数，没有不写

            //使用方法
            Object invoke = show.invoke(obj);
//            System.out.println(invoke);
        } catch (ClassNotFoundException e) {
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
