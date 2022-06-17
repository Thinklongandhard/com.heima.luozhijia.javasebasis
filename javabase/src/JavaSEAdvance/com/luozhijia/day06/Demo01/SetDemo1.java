package JavaSEAdvance.com.luozhijia.day06.Demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @anthor longway
 * @create 2022-06-17
 * 10:16
 */

//存储字符串并遍历
public class SetDemo1 {
    public static void main(String[] args) {

        //HashSet<String>(); 对集合的迭代顺序不做任何保证
        //Set是一个抽象类，没有具体实现的子类，只能通过子类抽象类的实现类来实现
        //多态
        Set<String> s = new HashSet<String>();

        //Set不包含重复元素
        s.add("hello");
        s.add("hello");
        s.add("work");
        s.add("java");
        s.add("word");

        //遍历
        //Set集合中没有索引方法，无法用普通for循环进行遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.print(next + " ");
            //java work hello word
            //HashSet对迭代的顺序不做任何保证
        }
    }
}
