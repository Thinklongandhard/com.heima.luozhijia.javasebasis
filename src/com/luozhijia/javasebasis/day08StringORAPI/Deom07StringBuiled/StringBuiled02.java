package com.luozhijia.javasebasis.day08StringORAPI.Deom07StringBuiled;

/**
 * @anthor longway
 * @create 2022-06-07
 * 18:02
 */
//常见的构造方法
public class StringBuiled02 {
    public static void main(String[] args) {
        //无参的
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("abc");  //创建一个根据传入的字符串对应的对象，内容可变
        System.out.println(sb1);
    }
}
