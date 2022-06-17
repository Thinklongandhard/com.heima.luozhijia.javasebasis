package JavaSEAdvance.com.luozhijia.day05.ListDemo8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @anthor longway
 * @create 2022-06-16
 * 18:04
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("word");
        list.add("java");

        //通过list集合的listIterator（）方法得到
//        ListIterator<String> li = list.listIterator();
//        while (li.hasNext()){
//            String s = li.next();
//            System.out.println(s);
//        }
//        System.out.println("--------");
//
//        //反向遍历
//        while (li.hasPrevious()){
//            String previous = li.previous();
//            System.out.println(previous);
//        }

        //获取列表迭代器
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()){
            String s = li.next();
            if (s.equals("word")){
                li.add("javaee");
            }
        }
        System.out.println(list);


    }
}
