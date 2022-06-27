package JavaSEAdvance.com.luozhijia.day14.Demo6;

import java.util.function.Predicate;

/**
 * @anthor longway
 * @create 2022-06-27
 * 15:40
 */
public class Demo {
    public static void main(String[] args) {
        //使用Lambda表达式测试predicate
//        boolean b1 = usePre("hello",(String s) -> {
//            boolean b = s.length() > 8;
//            return b;
//        });
//        System.out.println(b1);
        //优化
        boolean b = usePre("hello", s -> s.length() > 8);
        System.out.println(b);

        boolean b1 = usePre("helloworld", s -> s.length() > 8);
        System.out.println(b1);
    }

    private static boolean usePre(String s, Predicate<String> pre) {
//        return pre.test(s);
        //对结果取反
//        return !pre.test(s);
        return pre.negate().test(s);
        //源码
        /*
        default Predicate<T> negate() {
             return (t) -> !test(t);  采用的就是取反操作
        }
         */
    }
}
