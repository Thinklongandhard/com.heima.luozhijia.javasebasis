package JavaSEAdvance.com.luozhijia.day05.CollectionDemo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @anthor longway
 * @create 2022-06-16
 * 15:27
 */
public class IteratorTest {
    public static void main(String[] args) {
        //创建集合
        Collection<String> c = new ArrayList<String>();
        c.add("word");
        c.add("hello");
        c.add("word");
        Iterator<String> i = c.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }

    }
}
