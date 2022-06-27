package JavaSEAdvance.com.luozhijiaTest.day08.Demo2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:20
 */
/*
请编写main()方法，按以下要求顺序
	定义一个Set集合，并存储以下数据：
刘备，关羽，张飞，刘备，张飞
	打印集合大小
	使用迭代器遍历集合，并打印每个元素
	使用增强for遍历集合，并打印每个元素

 */
public class Demo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("刘备");
        s.add("关羽");
        s.add("张飞");
        s.add("刘备");
        s.add("张飞");
        //打印集合大小
        System.out.println(s.size());
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (String s1 : s){
            System.out.print(s1 + " ");
        }
    }
}
