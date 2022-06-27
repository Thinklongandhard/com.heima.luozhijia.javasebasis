package JavaSEAdvance.com.luozhijiaTest.day09.Demo4;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @anthor longway
 * @create 2022-06-21
 * 11:45
 */
/*
3.1 ArrayList有以下元素: "a","f","b","c","a","d"，请用任意方式完成集合元素去重。去除集合中重复的元素。
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        String[] s = new String[]{"a","f","b","c","a","d"};
        for (String s1 : s){
            al.add(s1);
        }
        HashSet<String> hs = new HashSet<String>();
        for (String s2 : al){
            hs.add(s2);
        }
        for (String s3 : hs){
            System.out.print(s3 + " ");
        }
    }
}
