package JavaSEAdvance.com.luozhijiaTest.day14.Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:30
 */
/*
请使用Lambda表达式调用Collections的sort()方法，可以实现对一个List<String>集合进行：降序排序。
	编写main()方法，在main()中按以下步骤编写代码：
	1. 定义一个List<String>集合，并存储以下数据：
			“cab”
			“bac”
			“acb”
			“cba”
			“bca”
			“abc”
	2. 使用Lambda表达式调用Collections的sort()方法对集合进行降序排序。
	3. 排序后向控制台打印集合的所有元素。

 */
public class Demo {
    public static void main(String[] args) {
        //创建一个List集合
        List<String> list = new ArrayList<String>();
        //存储数据
        list.add("cab");
        list.add("bac");
        list.add("acb");
        list.add("cba");
        list.add("bca");
        list.add("abc");
        //使用Lambda表达式
        //static <T> void sort(List<T> list, Comparator<? super T> c)
        Collections.sort(list,(a,b) ->{
            return b.compareTo(a);
        });
        System.out.println(list);
    }
}
