package JavaSEAdvance.com.luozhijia.day05.LisrDemo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-16
 * 16:27
 */
/*
   list 集合特点
      有序  ： 存取元素一致
      可重复： 存储元素可重复
 */
public class ListDemo5 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("word");

        //输出
        /*System.out.println(list);*/

        //遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
