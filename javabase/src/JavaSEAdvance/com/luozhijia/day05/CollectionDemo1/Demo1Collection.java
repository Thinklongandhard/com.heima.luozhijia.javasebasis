package JavaSEAdvance.com.luozhijia.day05.CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @anthor longway
 * @create 2022-06-16
 * 14:57
 */
/*
   创建Collection集合的对象
      多态的方式  --> ArrayList()
 */
public class Demo1Collection {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素  boolean add(E e)  E: 泛型
        c.add("hello");
        c.add("word");
        c.add("java");

        //输出集合对象
        System.out.println(c);
    }
}
