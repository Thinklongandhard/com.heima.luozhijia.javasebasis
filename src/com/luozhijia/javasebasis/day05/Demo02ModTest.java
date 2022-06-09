package com.luozhijia.javasebasis.day05;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-02
 * 19:48
 */
/*
* 需求：
*    设计一个方法（print）打印n到m之间的所有奇数
*    n和m键盘录入
* */
public class Demo02ModTest {
    public static void main(String[] args){
        //键盘录入
        Scanner sc = new Scanner(System.in);
        int[] number = new int[2];
        for (int i = 0;i < number.length;i++){
            number[i] = sc.nextInt();
        }
        print(number[0],number[1]);
    }
    //定义一个方法（print）
    public static void print(int n,int m){
        //打印n到m之间的所有奇数
        if (n>m){
            for (int i = m;i <= n;i++){
                if (i%2 !=0){
                    System.out.print(i + " ");
                }
            }
        }else{   //m>n
            for (int i = n;i <= m;i++){
                if (i%2 !=0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

