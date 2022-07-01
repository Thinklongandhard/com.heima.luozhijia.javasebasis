package JavaSEAdvance.com.luozhijia.day15.Demo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-06-29
 * 9:29
 */
public class Demo {
    public static void main(String[] args) {
        //使用反射创建有参构造
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo1.Student");
            Constructor<?> c1 = c.getConstructor(String.class);
            //创建对象
            Object obj = c1.newInstance("林青霞");
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
