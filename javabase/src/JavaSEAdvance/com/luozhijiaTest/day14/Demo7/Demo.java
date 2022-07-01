package JavaSEAdvance.com.luozhijiaTest.day14.Demo7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-28
 * 16:54
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
	先筛选出所有的“张”姓学员；
	再筛选出所有的“王”姓学员；
	将两个流合并为一个流
	打印合并后的每个元素。
 */
public class Demo {
    public static void main(String[] args) {
        //定义集合
        List<String> list = new ArrayList<String>();
        list.add("王佳乐");
        list.add("张三丰");
        list.add("王思聪");
        list.add("张飞");
        list.add("刘晓敏");
        list.add("张靓颖");
        list.add("王敏");
        //先筛选出所有的“张”姓学员；
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        //再筛选出所有的“王”姓学员；
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("王"));
        //将两个流合并为一个流
        //合并操作使用的是Stream中的静态方法concat
        Stream<String> s3 = Stream.concat(s1, s2);
        //打印合并后的每个元素。
        s3.forEach(System.out::println);
    }
}
