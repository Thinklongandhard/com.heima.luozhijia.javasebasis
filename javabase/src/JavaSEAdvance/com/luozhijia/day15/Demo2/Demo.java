package JavaSEAdvance.com.luozhijia.day15.Demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-06-29
 * 8:12
 */
public class Demo {
    public static void main(String[] args) {
        //利用反射获取.class对象
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo1.Student");
            //根据c获取构造方法
//            Constructor<?>[] cons = c.getConstructors();
            //获取所有公共的构造方法
//            Constructor<?>[] cons = c.getDeclaredConstructors();
            //获取所有构造方法
//            for (Constructor con : cons) {  //[Ljava.lang.reflect.Constructor;@4554617c  cons的内存地址
//                System.out.println(con);  //两个构造方法
//                //public JavaSEAdvance.com.luozhijia.day15.Demo1.Student()
//                //public JavaSEAdvance.com.luozhijia.day15.Demo1.Student(java.lang.String)
//            }
            //获取单个构造方法
            Constructor<?> con = c.getConstructor();  //单个无参构造方法
            Constructor<?> con1 = c.getDeclaredConstructor(String.class);  //根据传入参数判断获取到的那个方法

            //根据获取到的con创建对象
//            Object o = con.newInstance();
//            System.out.println(o);

            Object obj = con1.newInstance(String.class);
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
