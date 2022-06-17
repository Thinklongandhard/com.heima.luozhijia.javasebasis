package JavaSEAdvance.com.luozhijia.day06.Demo03HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @anthor longway
 * @create 2022-06-17
 * 11:05
 */
//存储字符串并遍历
public class HashDemo3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        //存储元素
        hs.add("hello");
        hs.add("word");
        hs.add("world");
        hs.add("java");
        //遍历
        //Iterator
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=========");
        //增强for
        for(String s : hs){
            System.out.println(s);
        }
    }
}
