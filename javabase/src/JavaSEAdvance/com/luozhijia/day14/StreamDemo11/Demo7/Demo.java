package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-28
 * 8:52
 */
/*
【Stream流的收集操作】
	对数据使用Stream流的方式操作完毕后，我想把流中的数据收集到集合中，方法
	Stream流的收集方法
	R collect(Collector collector)
	但是这个收集方法的参数是一个Collector接口

	工具类Collectors提供了具体的收集方式
	    public static <T> Collector toList()
		  //把元素收集到List集合中
		public static <T> Collector toSet()
		  //把元素收集到Set集合中
		public static Collector toMap(Function keyMapper,Function valueMappeer)
		  //把元素收集到Map集合中
 */
public class Demo {
    public static void main(String[] args) {
        //创建Arraylist集合
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("林青霞");
        arr.add("林清玄");
        arr.add("赵云");
        //筛选长度为3的
        List<String> list = arr.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        for (String s : list){
            System.out.println(s);
        }
        //创建Set集合
        HashSet<String> s = new HashSet<String>();
        s.add("50");
        s.add("80");
        s.add("75");
        //筛选大于70的
        Set<String> set = s.stream().filter(b -> Integer.parseInt(b) > 70).collect(Collectors.toSet());
        for (String s1 : set){
            System.out.println(s1);
        }
        //创建Map集合
        String[] ser = {"林青霞,30","王祖贤,18","李垚坪,19"};
        //年龄大于18的
        Map<String, Integer> map = Stream.of(ser).filter(se -> Integer.parseInt(se.split(",")[1]) > 18).
                collect(Collectors.toMap(key -> key.split(",")[0], value -> Integer.parseInt(value.split(",")[1])));
        Set<String> keySet = map.keySet();
        for (String ss : keySet){
            Integer value = map.get(ss);
            System.out.println(ss + "," + value);
        }
    }
}
