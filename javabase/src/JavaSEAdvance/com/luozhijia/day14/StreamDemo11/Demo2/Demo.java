package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo2;

import java.util.*;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-27
 * 19:09
 */
/*
生成流方式：
	Stream流的常见生成方式
	Collection体系的集合可以使用默认方法stream()生成流
	    default Stream<E> stream()
	Map体系的集合间接的生成流
	数组可以通过Stream接口的静态方法of(T...values)生成流
 */
public class Demo {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> map = new HashMap<String,Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        //通过获取每一个键值对获取Stream流
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArr = {"hello","world","java"};
        Stream<String> strArrStream = Arrays.stream(strArr);
        Stream<String> stringStream2 = Stream.of("hello", "world", "java");
        //int类型也可以
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}
