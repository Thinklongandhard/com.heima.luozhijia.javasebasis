package JavaSEAdvance.com.luozhijia.day06.Demo05LinkedHashSet;

import java.util.LinkedHashSet;

/**
 * @anthor longway
 * @create 2022-06-17
 * 15:01
 */
public class LinkedHashSetTest5<S> {
    //存储字符串并遍历
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        //他的底层是链表和哈希表
        //所以元素不可重复

        //存储字符串
        lh.add("Hello");
        lh.add("work");
        lh.add("垚");

        //遍历
        //因为没有返回索引的方法，所以不能使用普通for
        //增强for
        for(String s:lh){
            System.out.print(s + " ");
        }
    }
}
