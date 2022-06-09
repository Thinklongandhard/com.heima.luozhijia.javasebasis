package com.luozhijia.javasebasis.day02;

/**
 * @anthor longway
 * @create 2022-05-30
 * 18:15
 */
public class Demo1ForceConversion {
    public static void main(String[] args){
        byte b1 = 5;
        byte b2 = 4;
        //byte short char  三种数据类型运算时，不管是否有更范围更高的数据类型都要先提升为int
        //强转
        byte c1 = (byte) (b1+b2);
        int c2 = b1 + b2;
        System.out.println(c1 + c2);
    }
}
