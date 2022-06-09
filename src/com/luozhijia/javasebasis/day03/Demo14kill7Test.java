package com.luozhijia.javasebasis.day03;
import java.util.Random;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   逢7过
*     含有7的和7的倍数都过
* */
public class Demo14kill7Test {
    public static void main(String[] args){
        Random r = new Random();
        int seven = r.nextInt(101);
        for (int i = seven;i < 101;i++){
            int ge = i % 10;
            int shi = i / 10 ;
            if (ge == 7 || shi == 7 || i%7 == 0){
                System.out.println(i);
            }
        }
    }
}
