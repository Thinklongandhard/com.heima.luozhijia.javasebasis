package JavaSEAdvance.com.luozhijia.day14.Demo8Test;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @anthor longway
 * @create 2022-06-27
 * 16:02
 */
/*
需求： 姓名长度大于2，年龄大于33
 */
public class Demo {
    public static void main(String[] args) {
        //创建一个字符数组
        String[] s = {"林青霞,30", "李垚坪,18", "张曼玉,35", "王祖贤,34"};
        //调用方法
        //创建数组
//        ArrayList<String> arr = usePred(s,(str) -> {
//            boolean b = str.split(",")[0].length()>2;
//            return b;
//        },(str) -> {
//            boolean b2 = Integer.parseInt(str.split(",")[1]) > 33;
//            return b2;
//        });
//        System.out.println(arr);

        //优化
        ArrayList<String> arr = usePred(s, str -> str.split(",")[0].length() > 2,
                str -> Integer.parseInt(str.split(",")[1]) > 33);
        System.out.println(arr);
    }

    private static ArrayList<String> usePred(String[] s, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> arr = new ArrayList<String>();
        //进行判断满足添加条件的字符串
        for (String str : s) {
//            if (s[i].split(",")[0].length() < 2 && Integer.parseInt(s[i].split(",")[1]) > 33) {
//                arr.add(s[i]);
//            }
            boolean test = pre1.and(pre2).test(str);
            if (test) {
                arr.add(str);
            }
        }
        //返回一个数组
        return arr;

    }
}
