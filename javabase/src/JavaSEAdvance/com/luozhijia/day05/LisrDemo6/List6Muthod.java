package JavaSEAdvance.com.luozhijia.day05.LisrDemo6;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-16
 * 16:34
 */
public class List6Muthod {
    public static void main(String[] args) {
        //创建对象
        List<String> list = new ArrayList<String>();
        //插入元素
        //void add(int index,E element)
        //元素可以重复
        list.add(0,"hello");
        list.add(1,"word");
        list.add(2,"hello");
        list.add(1,"word");
        //System.out.println(list);
        //[hello, word, word, hello]

        //删除指定索引位置的元素，返回被删除的元素
        //E remove(int index)
        //String s = list.remove(1);
        //System.out.println(s);  //word


        //修改指定索引处的元素，返回被修改的元素
        String set = list.set(1, "hello");
        System.out.println(set);  //word
        //[hello, hello, hello]


        //返回指定索引处的元素
        String s1 = list.get(3);
        System.out.println(s1);  //hello
    }
}
