package com.luozhijia.javasebasis.day08StringORAPI.Deom02PracticeString;

/**
 * @anthor longway
 * @create 2022-06-07
 * 15:32
 */
/*String常见的构造方法：
        1、public String()  无参构造
        2、public String(char[] chs)
        根据字符数组的内容，来创建字符串对象
        3、public String(String original)
        根据传入的字符串内容，来创建字符串对象
        4、String s = "abc";
        根据赋值的方法创建字符串对象。
        */
public class Demo02String2 {
    public static void main(String[] args) {
        //空参构造
        String s = new String();
        System.out.println(s);
        //注意：String这个类比较特殊，打印其对象名的时候，
        // 	  不会出现内存地址，而是该对象所记录的真实内容。

        //字符数组
        char[] chs = new char[]{'a','b','c'};
        String s1 = new String(chs);
        System.out.println(s1);

        //传入字符串内容
        String s2 = new String("abcde");
        System.out.println(s2);
    }
}
