package JavaSEAdvance.com.luozhijiaTest.day08.Demo4;

import java.util.LinkedHashSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 10:38
 */
/*
请按以下要求顺序编码：
	定义一个可以存储“整数”的LinkedHashSet对象
	存储以下整数
20,30,50,10,30,20
	打印集合大小。为什么跟存入的数量不一致？
     //因为有重复元素
	使用增强for遍历集合，打印大于25的元素

 */
public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> li = new LinkedHashSet<Integer>();
        li.add(20);
        li.add(30);
        li.add(50);
        li.add(10);
        li.add(30);
        li.add(20);
        //打印
        System.out.println(li.size());
        for (Integer i : li){
            if (i > 25){
                System.out.print(i + " ");
            }
        }
    }
}
