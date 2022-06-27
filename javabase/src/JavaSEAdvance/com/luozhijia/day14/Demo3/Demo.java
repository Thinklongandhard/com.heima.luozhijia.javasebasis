package JavaSEAdvance.com.luozhijia.day14.Demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @anthor longway
 * @create 2022-06-26
 * 20:26
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("alskjd");
        list.add("asda");
        list.add("asd");
        list.add("as");

        //比较前输出
        System.out.println(list);
        //进行比价
//        Collections.sort(list);
        Collections.sort(list,getComparator());

        System.out.println(list);
    }
    //返回值类型是一个函数式接口
    private static Comparator<String> getComparator(){
        //匿名内部类的方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return comp;
        //直接return一个
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

        //使用Lambda表达式的方式
//        return (String s1,String s2) -> {
//            return s1.length() - s2.length();
//        };

        //优化
        return (s1,s2) -> s1.length() - s2.length();
    }
}
