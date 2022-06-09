package com.luozhijia.javasebasis.day08StringORAPI.Deom03EqualsString;

/**
 * @anthor longway
 * @create 2022-06-07
 * 16:08
 */
public class Demo3Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "123";
        String s3 = "Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s3));
        //这是忽略大小写的比较
    }
}
