package com.luozhijia.javasebasis.day03;
import java.util.Random;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   获取一个10以内，包含10的随机数
* */
public class Demo12Random {
    public static void main(String[] args){
        Random r = new Random();
        int number = r.nextInt(11);
        System.out.println(number);
    }
}
