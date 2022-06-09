package com.luozhijia.javasebasis.day02;

/**
 * @anthor longway
 * @create 2022-05-30
 * 18:15
 */
public class Demo2ForceConversion {
    public static void main(String[] args){
        /*
        java常量优化机制
           byte = 3 + 4； 3和4是常量，java优化机制是让两者相加，然后判断结果是否在byte的范围内
        * */
        byte b = 3 + 4;
        System.out.println(b);

        int i = 1;
        char c = 'a';
        int b1 = i + c;
        System.out.println(b1);
    }
}
