package JavaSEAdvance.com.luozhijia.day14.Demo10;

import java.util.function.Function;

/**
 * @anthor longway
 * @create 2022-06-27
 * 17:15
 */
public class Demo {
    public static void main(String[] args) {
        useFun("李垚坪,18",s -> Integer.parseInt(s.split(",")[1]),integer -> integer = integer + 70);
    }
    private static void useFun(String s, Function<String,Integer> fun1,Function<Integer,Integer> fun2){
        Integer integer = fun1.andThen(fun2).apply(s);
        System.out.println(integer);
    }
}
