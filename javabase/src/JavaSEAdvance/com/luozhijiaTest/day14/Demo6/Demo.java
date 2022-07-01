package JavaSEAdvance.com.luozhijiaTest.day14.Demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:48
 */
/*
定义main()方法，按以下顺序编写程序：
	定义集合List<String>，添加以下数据：
	“王佳乐”
			“张三丰”
			“王思聪”
			“张飞”
			“刘晓敏”
			“张靓颖”
			“王敏”

	使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
	筛选后，获取前两个，并打印。
	重新获取Stream流，用filter()方法筛选出所有的“王”姓学员；
	筛选后，跳过前1个，打印剩余的人员。

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
        //使用Stream流的filter()方法筛选集合中所有的“张”姓学员；
        Stream<String> str1 = list.stream().filter(s -> s.startsWith("张"));

        //筛选后，获取前两个，并打印。
        //使用limit方法
        str1.limit(2).forEach(System.out::println);
        //重新获取Stream流，用filter()方法筛选出所有的“王”姓学员；
        Stream<String> str2 = list.stream().filter(s -> s.startsWith("王"));
        //筛选后，跳过前1个，打印剩余的人员。
        //筛选后只有一个元素，所以直接跳过，没有输出结果
        str2.skip(1).forEach(System.out::println);
    }
}
