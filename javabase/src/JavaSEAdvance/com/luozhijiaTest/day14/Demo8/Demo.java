package JavaSEAdvance.com.luozhijiaTest.day14.Demo8;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:59
 */
/*
	2.定义main()方法，按依稀顺序编写程序：
	定义集合List<String>，添加以下数据：
		“王佳乐”
		“张三丰”
		“王思聪”
		“张飞”
	使用Stream流的map()方法，将每个元素封装为一个Person对象。
	将新流中的元素提取为List集合。
	遍历、打印集合中所有的Person对象信息

 */
public class Demo {
    public static void main(String[] args) {
        //定义集合
        List<String> list = new ArrayList<String>();
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        //使用Stream流的map()方法，将每个元素封装为一个Person对象。
        //使用map进行封装，直接输出的是每个对象的地址空间
//        list.stream().map(Person::new).forEach(System.out::println);
        list.stream().map(Person::new).forEach(s -> System.out.println(s.getName()));
    }
}
