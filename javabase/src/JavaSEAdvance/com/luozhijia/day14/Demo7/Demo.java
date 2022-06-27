package JavaSEAdvance.com.luozhijia.day14.Demo7;

import java.util.function.Predicate;

/**
 * @anthor longway
 * @create 2022-06-27
 * 15:54
 */
/*
	   default Predicate<T> and(Predicate other)
	     //返回一个组合判断，对应短路与
	   default Predicate<T> or(Predicate other)
	     //返回一个组合判断，对应短路或
 */
public class Demo {
    public static void main(String[] args) {
        //使用Lambda表达式进行实现
        boolean b1 = usePred("hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b1);
        boolean b2 = usePred("helloworld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b2);
    }

    private static boolean usePred(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b3 = b1 && b2;
//        return b3;
        //代码优化,对一个字符串进行两个判断，最后将两个判断结果进行与操作
//        return pre1.and(pre2).test(s);
//        /*  //and方法的源码
//        default Predicate<T> and(Predicate<? super T> other) {
//             Objects.requireNonNull(other);
//             return (t) -> test(t) && other.test(t);
//        }
//         */

        //短路或
        return pre1.or(pre2).test(s);
        /*
        default Predicate<T> or(Predicate<? super T> other) {
             Objects.requireNonNull(other);
             return (t) -> test(t) || other.test(t);
        }
         */
    }
}
