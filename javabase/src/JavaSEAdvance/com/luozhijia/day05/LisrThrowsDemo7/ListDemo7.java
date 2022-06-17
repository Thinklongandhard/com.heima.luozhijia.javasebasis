package JavaSEAdvance.com.luozhijia.day05.LisrThrowsDemo7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-16
 * 17:03
 */
//并发修改异常
public class ListDemo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //添加
        list.add("hello");
        list.add("word");
        list.add("java");

        //遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            //ConcurrentModificationException
            String s = it.next();
            if (s.equals("word")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
