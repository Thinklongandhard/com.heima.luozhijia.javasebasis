package JavaSEAdvance.com.luozhijiaTest.day14.Demo5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:46
 */
/*
定义main()方法，按以下顺序编写程序：
	定义集合List<String>，添加以下数据：
			“张三丰”
			“王思聪”
			“张飞”
			“刘晓敏”
			“张靓颖”
	使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
	筛选后，使用count()方法获取筛选的数量。

 */
public class Demo {
    public static void main(String[] args) {
        //定义集合
        List<String> list = new ArrayList<String>();
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张靓颖");
        //使用Stream流的filter()方法筛选集合中所有的“张”姓学员
        Stream<String> listStream = list.stream().filter(s -> s.startsWith("张"));

        //筛选后，使用count()方法获取筛选的数量。
        long count = listStream.count();
        System.out.println(count);
    }
}
