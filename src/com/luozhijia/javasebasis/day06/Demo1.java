package com.luozhijia.javasebasis.day06;

/**
 * @anthor longway
 * @create 2022-06-04
 * 19:15
 */
/*
java中除了十进制以外都要进行修饰
        二进制：数值前面以0b开头，b大小写都行
        八进制：数值前面以0开头
        十六进制：数值前面以0x开头，x的大小写都行

        注意：打印在控制台的数据都会转换成10进制的数据
*/
public class Demo1 {
    public static void main(String[] args){
        System.out.println(10);
        System.out.println(0b10);
        System.out.println(010);
        System.out.println(0x10);
    }
}
