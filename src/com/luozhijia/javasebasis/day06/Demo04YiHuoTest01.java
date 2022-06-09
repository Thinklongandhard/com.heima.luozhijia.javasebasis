package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-04
 * 19:15
 */
/*
   ^ 运算符的特点
       一个数，被另一个数异或两次，该数本身不变(操作常量)
   需求：
      实现数据交换
      将两个整数变量，在不使用第三方变量的情况下进行数据交换
*/
public class Demo04YiHuoTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
        /*System.out.println(b^a^a);
        System.out.println(a^b^b);*/
    }
}
