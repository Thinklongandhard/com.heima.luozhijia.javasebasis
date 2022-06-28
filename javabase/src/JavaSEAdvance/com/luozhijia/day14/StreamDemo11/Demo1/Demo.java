package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo1;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-27
 * 18:40
 */
/*
   创建一个集合，存储多个字符串元素
   把集合中所有以“张”开头的元素存储到一个新的集合
   把“张”开头的集合中的长度为3的元素存储到一个新的集合
   遍历上一步得到的集合
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("李xx");
        list.add("罗xx");
        list.add("李系x");
        list.add("李x");
        list.add("陈xx");
        //把集合中所有以“李”开头的元素存储到一个新的集合
        //新集合
        ArrayList<String> li = new ArrayList<String>();
        for (String str : list){
            if (str.startsWith("李")){
                li.add(str);
            }
        }
        //把“张”开头的集合中的长度为3的元素存储到一个新的集合
        //新集合
        ArrayList<String> three = new ArrayList<String>();
        for (String str : li){
            if (str.length() == 3){
                three.add(str);
            }
        }
        //遍历上一步得到的集合
        for (String str : three){
            System.out.println(str);
        }
        System.out.println("---------");
        //使用Stream流
        list.stream().filter(s -> s.startsWith("李")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
