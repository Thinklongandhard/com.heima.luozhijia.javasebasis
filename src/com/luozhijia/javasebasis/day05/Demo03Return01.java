package com.luozhijia.javasebasis.day05;
import java.util.Scanner;

/**
 * @anthor longway
 * @create 2022-06-04
 * 11:58
 */
/*
   需求：
     带有返回值的类型
        定义一个方法，计算两数相加之和
 */
public class Demo03Return01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        for (int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
        }
        int number = Sum(num[1],num[0]);
    }
    public static int Sum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
