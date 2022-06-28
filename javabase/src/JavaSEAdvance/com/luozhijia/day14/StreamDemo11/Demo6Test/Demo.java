package JavaSEAdvance.com.luozhijia.day14.StreamDemo11.Demo6Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @anthor longway
 * @create 2022-06-28
 * 8:06
 */
public class Demo {
    public static void main(String[] args) {
        //创建两个集合
        ArrayList<String> sexn = new ArrayList<String>();
        ArrayList<String> sexv = new ArrayList<String>();
        //存储元素
        sexn.add("林青霞");
        sexn.add("林清玄");
        sexn.add("赵云");
        sexn.add("李垚垚");
        sexn.add("王祖贤");
        sexn.add("刘备");
        //sexv
        sexv.add("貂蝉");
        sexv.add("林清玄");
        sexv.add("林青霞");
        sexv.add("王祖贤");
        sexv.add("王昭君");
        sexv.add("林清轩");

        //使用stream流sexn只要名字为3个字的前3人
//        Stream<String> nan = sexn.stream().filter(s -> s.length() == 3).limit(3);
//        //sexv只要行林的，且不要第一个
//        Stream<String> nv = sexv.stream().filter(s -> s.startsWith("林")).skip(1);
//        //把过滤后的两个流进行合并
//        Stream<String> concat = Stream.concat(nv, nan);
////        Object[] array = concat.toArray();
//        //把上一步操作后的元素作为构造方法的参数创建演员对象，遍历数据
//        //使用map
////        concat.map(Actor::new).forEach(System.out::println);
//        concat.map(Actor::new).forEach(s -> System.out.println(s.getName()));

        //合并
        Stream.concat(sexn.stream().filter(s -> s.length() == 3).limit(3),
                sexv.stream().filter(s -> s.startsWith("林")).skip(1)).
                map(Actor::new).forEach(s -> System.out.println(s.getName()));
    }
}
