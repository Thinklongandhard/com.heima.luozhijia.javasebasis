package com.luozhijia.javasebasis.day02;

import java.util.stream.Stream;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-05-30
 * 18:15
 */
/*
* 键盘录入一个三位数，自动进行拆分成百位，十位，个位进行输出
* */
public class Demo3Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nextin = sc.nextInt();
        //百位
        System.out.println(nextin/100);
        //十位
        System.out.println((nextin%100)/10);
        //个位
        System.out.println((nextin%100)%10);
    }
}
