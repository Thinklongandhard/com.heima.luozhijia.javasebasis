package com.luozhijia.javasebasis.day03;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-05-31
 * 15:46
 */
/*
* 案例实现：
*   控制台输出1~5和5~1
* */
public class Demo8For {
    public static void main(String[] args){
        for(int i = 1;i < 6;i++){
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int b = 5;b > 0;b--){
            System.out.println(b);
        }
        System.out.println("---------------------------");
        int number = 0;
        for(int i = 1;i < 6;i++){
            number =number + i;
        }
        System.out.println(number);
        System.out.println("---------------------------");
        //求1~100之间的偶数和
        int sum = 0;
        for (int i = 0;i <= 100; i=i+2){
            sum += i;
        }
        System.out.println(sum);
        for (int i = 1;i <=100;i++){
            if (i%2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
