package JavaSEAdvance.com.luozhijia.day05.CollectionDemo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @anthor longway
 * @create 2022-06-16
 * 15:07
 */
public class CollectionMuthod2 {
    public static void main(String[] args) {
        //创建Collection对象
        Collection<Integer> c = new ArrayList<Integer>();
        //传入Integer数据
        //boolean add(E e)
        boolean b1 = c.add(1);
        //System.out.println(b1);  //true 永远都是返回true
        c.add(2);
        c.add(3);
        //System.out.println(c);  //[1, 2, 3]


        //移出指定数据
        //boolean remove(Object o)
        c.remove(2);
        //System.out.println(c);  //[1, 3]
        //添加
        c.add(2);


        //清空元素
        //void clear();
       /* c.clear();
        System.out.println(c);*/  //[]


        //判断集合中是否存在指定元素
        //boolean contains(Object o);
        boolean b = c.contains(2);
        //System.out.println(b);  //true


        //判断集合是否为空
        //boolean isEmpty()
        boolean cEmpty = c.isEmpty();
        //System.out.println(cEmpty);  //false


        //集合的长度/元素的个数
        int size = c.size();
        System.out.println(size);  //3
    }

}
