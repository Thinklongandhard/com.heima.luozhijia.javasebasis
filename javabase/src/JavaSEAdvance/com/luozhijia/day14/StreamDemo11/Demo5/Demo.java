package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo5;

import java.util.ArrayList;

/**
 * @anthor longway
 * @create 2022-06-27
 * 20:46
 */
/*
   【Stream流的常见终结操作方法】
	void forEach(Consumer action):
	  //对此流的每个元素执行操作
	  Consumer接口中的方法   void accept(T t):对给定的参数执行此操作
	long count:
	  //返回此流中的元素数
 */
public class Demo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<String>();
        list.add("30");
        list.add("10");
        list.add("20");
        list.add("40");
        list.add("50");
       /* <R>Stream<R>map(Function mapper):
        //返回由给定函数应用于此流的元素的结果组成的流
        Function接口中的方法   R apply(T t)
        IntStream mapToInt(ToIntFunction mapper):
        //返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        IntStream: 表示原始int流
        ToIntFunction接口中的方法   int applyAsInt(T value)
       */
        //字符串转为int值
//        list.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
        //优化
//        list.stream().map(Integer::parseInt).forEach(System.out::println);

        //返回一个IntStream其中包含将给定函数应用于此流的元素的结果mapToInt
        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //返回集合中的元素个数
        long count = list.stream().mapToInt(Integer::parseInt).count();
        System.out.println(count);

        //返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
