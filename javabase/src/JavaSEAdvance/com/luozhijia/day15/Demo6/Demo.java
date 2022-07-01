package JavaSEAdvance.com.luozhijia.day15.Demo6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-06-29
 * 10:48
 */
public class Demo {
    public static void main(String[] args) {
        //给成员变量name赋值，age赋值，path赋值
        //获取.class
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo5.Student");
            //获取每个成员变量
            Field name = c.getDeclaredField("name");
            //暴力反射   访问到私有的成员变量
            name.setAccessible(true);

            //获取年龄
            Field age = c.getDeclaredField("age");
            //暴力反射
            age.setAccessible(true);

            //获取path
            Field path = c.getDeclaredField("path");
            //暴力反射
            path.setAccessible(true);

            //获取无参构造方法
            Constructor<?> con = c.getConstructor();
            //创建对象
            Object obj = con.newInstance();
            //通过set方法修改成员变量
            name.set(obj,"林青霞");
            age.set(obj,33);
            path.set(obj,"西安");
            //输出在控制台
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
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
