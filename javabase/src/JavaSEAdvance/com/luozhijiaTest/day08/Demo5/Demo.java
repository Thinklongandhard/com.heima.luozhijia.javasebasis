package JavaSEAdvance.com.luozhijiaTest.day08.Demo5;

import java.util.TreeSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:40
 */
/*
	定义一个可以存储“整数”的TreeSet对象
	存储以下整数
30,20,50,10,30,20
	打印集合大小。为什么跟存入的数量不一致？
	遍历集合，打印大于25的元素
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        System.out.println(ts.size());
        for (Integer it : ts){
            System.out.print(it + " ");
        }
    }
}
