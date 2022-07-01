package JavaSEAdvance.com.luozhijia.day15.Demo4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-06-29
 * 9:38
 */
//使用暴力反射来修改私有方法
public class Demo {
    public static void main(String[] args) {
        //使用反射获取Constructor
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo1.Student");
            //获取私有的构造方法
            Constructor<?> con = c.getDeclaredConstructor(String.class, int.class);

            //暴力反射调用setAccessible方法，方法的默认值是false，我们修改为true后可以对私有构造方法进行访问
            //值为true取消访问检查，所有可以访问私有方法
            con.setAccessible(true);

            //利用私有构造方法创建对象
            Object obj = con.newInstance("林青霞", 30);
            //输出
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
