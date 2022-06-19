package JavaSEAdvance.com.luozhijia.day07.CollectionsDemo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-18
 * 18:07
 */

//public static <T extends Comparable<? super T>> void sort(List<T>list)
////将指定的列表按升序排序
//public static void reverse(List<?> list)
////反转指定列表中元素的顺序
//public static void shuffle(List<?> list)
////使用默认的随机源随机排列指定的列表
public class CollectionsDemo10 {
    public static void main(String[] args) {
        //新建一个List集合
        List<Integer> list = new ArrayList<Integer>();

        //添加元素
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(25);

        ////public static <T extends Comparable<? super T>> void sort(List<T>list)
        //将指定的列表按升序排序
        //Collections.sort(list);   //自然排序

        //public static void reverse(List<?> list)
        //反转指定列表中元素的顺序
        //Collections.reverse(list);

        //public static void shuffle(List<?> list)
        //使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);

        //输出集合
        System.out.println(list);
    }
}
