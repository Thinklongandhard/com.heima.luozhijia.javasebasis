package JavaSEAdvance.com.luozhijiaTest.day14.Demo4;

import java.util.ArrayList;
import java.util.List;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:44
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
	筛选后，使用forEach()方法打印筛选结果。

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
        //筛选所有“张”姓
        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
    }
}
