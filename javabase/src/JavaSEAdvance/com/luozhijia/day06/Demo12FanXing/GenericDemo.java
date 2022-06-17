package JavaSEAdvance.com.luozhijia.day06.Demo12FanXing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @anthor longway
 * @create 2022-06-17
 * 18:54
 */

//需求： Collection集合存储字符串并遍历
public class GenericDemo {
    public static void main(String[] args) {
        //创建对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("word");
        c.add("java");
        //c.add(100);

        Iterator it = c.iterator();
        while (it.hasNext()){
//            Object o = it.next();
//            System.out.println(o);
            String s = (String)it.next();
            //ClassCastException
            System.out.println(s);
        }
    }
}
