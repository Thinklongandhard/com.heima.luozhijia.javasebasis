package JavaSEAdvance.com.luozhijia.day15.Demo5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @anthor longway
 * @create 2022-06-29
 * 10:13
 */
//需求：反射获取成员变量并使用
public class Demo {
    public static void main(String[] args) {
        //反射获取成员变量
        try {
            Class<?> c = Class.forName("JavaSEAdvance.com.luozhijia.day15.Demo5.Student");
            //获取所有的属性getDeclaredFields，包括私有属性
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields){
                System.out.println(f);
            }
            //获取成员变量
            Field name = c.getField("name");
            //通过构造方法进行使用
            Constructor<?> con = c.getConstructor();
            //创建无参构造方法
            Object o = con.newInstance();
            //通过无参构造方法使用成员变量
            name.set(o,"林青霞");  //给o对象的name成员变量进行赋值
            //Student{name='林青霞', age=0, path='null'}
            System.out.println(o);
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
