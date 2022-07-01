package JavaSEAdvance.com.luozhijia.day16Junit.Demo2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @anthor longway
 * @create 2022-06-30
 * 11:33
 */
@Annor(className = "JavaSEAdvance.com.luozhijia.day15.Demo5.Student",methodName = "show")
public class Demo {
    public static void main(String[] args) {
        //获取当前class字节码文件
        Class<Demo> c = Demo.class;
        //解析注解
        //获取注解对象
        //就是在内存中创建了一个该注解的子类接口实现对象
        Annor an = c.getAnnotation(Annor.class);
        //获取对象
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //通过获取到的className创建class对象
        try {
            Class<?> c1 = Class.forName(className);
            //创建对象
            Object obj = c1.newInstance();
            //访问方法
            Method m = c1.getDeclaredMethod(methodName);
            //暴力反射
            m.setAccessible(true);
            Object o = m.invoke(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
