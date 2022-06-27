package JavaSEAdvance.com.luozhijia.day14.Demo9;

import java.util.function.Function;

/**
 * @anthor longway
 * @create 2022-06-27
 * 15:54
 */

public class Demo {
    public static void main(String[] args) {
        //调用方法
        convert("100",s -> Integer.parseInt(s));
        //将数字转为字符串
        convert(15,i -> String.valueOf(i + 64));
        //将字符串转为数字，然后加一个整数，在转为字符串
        convert("100",s -> Integer.parseInt(s),integer -> String.valueOf(integer + 546));
    }
    //将字符串转为数字
    private static void convert(String s, Function<String,Integer> fun){
//        Integer i = fun.apply(s);
        int i = fun.apply(s);
        System.out.println(i);
    }
    //将数字加上一个整数然后转为字符串
    private static void convert(int i,Function<Integer,String> fun){
        String s = fun.apply(i);
        System.out.println(s);
    }
    //将字符串转为数字，然后加一个整数，在转为字符串
    private static void convert(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }
}
