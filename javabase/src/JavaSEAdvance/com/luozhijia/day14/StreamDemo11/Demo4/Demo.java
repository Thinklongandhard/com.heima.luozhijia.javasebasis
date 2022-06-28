package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo4;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-27
 * 20:06
 */
/*
    Stream<T> sorted():
	  //返回由此流的元素组成的流，根据自然顺序排序
	Stream<T> sorted(Comparator comparator):
	  //返回由该流的元素注册的流，根据提供的Comparator进行排序
	  Comparator接口中的方法  int compare(T o1, T o2)

 */
public class Demo {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String>list = new ArrayList<String>();
        list.add("zhangmanyu");
        list.add("linqingxia");
        list.add("wangzuxian");
        list.add("liuyuan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //返回由此流的元素组成的流，根据自然顺序排序
//        list.stream().sorted().forEach(System.out::println);

        //返回由该流的元素注册的流，根据提供的Comparator进行排序
        list.stream().sorted((s1,s2) -> {
           int num = s1.length() - s2.length();
           int num2 = num == 0 ? s1.compareTo(s2) : num;
           return num2;
        }).forEach(System.out::println);
    }
}
