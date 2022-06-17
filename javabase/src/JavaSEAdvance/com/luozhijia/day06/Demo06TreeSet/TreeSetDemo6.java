package JavaSEAdvance.com.luozhijia.day06.Demo06TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 15:19
 */
//存储整数并遍历
public class TreeSetDemo6 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Integer> ts = new TreeSet<Integer>();
        //存储整数
        ts.add(10);   //自动装箱
        ts.add(100);
        ts.add(101);
        ts.add(20);
        ts.add(5);

        //由于是Set集合的子类的具体实现类
        //所以不能录入重复元素
        ts.add(10);

        //遍历
        //没有返回索引的方法，不能使用普通for
        for (Integer i : ts){
            System.out.print(i + " ");
            //5 10 20 100 101  自然排序
        }
        System.out.println();
        //增强Iterator
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.print(next + " ");
        }
    }
}
